package com.hotel.model.dto;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Data
@NoArgsConstructor
@ToString
@Builder
public class EmpleadoDto implements Serializable {

    private Integer idEmpleado;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String ocupacion;
    private String telefono;

}
