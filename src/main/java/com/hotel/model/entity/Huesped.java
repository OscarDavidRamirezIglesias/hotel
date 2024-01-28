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
@Table(name = "huesped")
public class Huesped implements Serializable {

    @Id
    @Column(name = "id_huesped")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHuesped;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fechaNacimiento")
    private String fechaNacimiento;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "reservas")
    private String reservas;
}
