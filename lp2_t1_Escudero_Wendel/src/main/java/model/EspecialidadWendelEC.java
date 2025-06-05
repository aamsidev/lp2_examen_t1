package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_especialidad")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EspecialidadWendelEC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidad")
    @EqualsAndHashCode.Include
    private int id;

    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;
}
