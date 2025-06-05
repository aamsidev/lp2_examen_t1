package model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name = "tbl_equipo_dental")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EquipoDentalWendelEC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_equipo")
    @EqualsAndHashCode.Include
    private int nroEquipo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "costo", nullable = false, precision = 10, scale = 2)
    private Double costo;

    @Column(name = "fecha_adquisicion")
    private LocalDate fechAdq;

    @Column(name = "estado", nullable = false, length = 1)
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dentista")
    private DentistaWendelEC dentista;
}
