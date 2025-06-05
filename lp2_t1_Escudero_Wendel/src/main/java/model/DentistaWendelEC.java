package model;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_dentista")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DentistaWendelEC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dentista")
    @EqualsAndHashCode.Include
    private int id;

    @Column(name = "cop", nullable = false, length = 6)
    private String cop;

    @Column(name = "nombre_completo", nullable = false, length = 50)
    private String nomCompleto;

    @Column(name = "fecha_inicio_contrato", nullable = false)
    private LocalDate fechIni;

    @Column(name = "turno", nullable = false, length = 1)
    private String turno;

    @Column(name = "correo", nullable = false, unique = true, length = 50)
    private String correo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_especialidad", nullable = false)
    private EspecialidadWendelEC especialidadWendelEC;
    
	@Override
	public String toString() {
	    return nomCompleto;
	}
}
