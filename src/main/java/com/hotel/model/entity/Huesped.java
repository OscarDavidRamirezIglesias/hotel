package com.hotel.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "huespedes")
public class Huesped implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHuesped;

    private String nombre;

    private String apellido;

    private String fechaNacimiento;

    private String nacionalidad;

    private String telefono;

    private String reserva;
}
