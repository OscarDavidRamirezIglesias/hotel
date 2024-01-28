package com.hotel.service;

import com.hotel.model.dto.EmpleadoDto;
import com.hotel.model.entity.Empleado;

public interface IEmpleado {

    Empleado save(EmpleadoDto empleado);

    Empleado findById(Integer id);

    void delete(Empleado empleado);
}


