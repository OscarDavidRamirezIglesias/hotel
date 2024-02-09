package com.hotel.model.dto;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Data
@ToString
@Builder
public class HuespedDto implements Serializable {

    private Integer idHuesped;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;
    private String reservas;
}
