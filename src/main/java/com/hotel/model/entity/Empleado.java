package com.hotel.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "empleado")
public class Empleado implements Serializable {

    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpleado;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fechaNacimiento")
    private String fechaNacimiento;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "telefono")
    private String telefono;

}
