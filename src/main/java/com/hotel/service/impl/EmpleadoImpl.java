package com.hotel.service.impl;

import com.hotel.model.dao.EmpleadoDao;
import com.hotel.model.dto.EmpleadoDto;
import com.hotel.model.entity.Empleado;
import com.hotel.service.IEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoImpl implements IEmpleado {

    @Autowired
    private EmpleadoDao empleadoDao;
    @Transactional
    @Override
    public Empleado save(EmpleadoDto empleadoDto) {
        Empleado empleado = Empleado.builder()
                .idEmpleado(empleadoDto.getIdEmpleado())
                .nombre(empleadoDto.getNombre())
                .apellido(empleadoDto.getApellido())
                .fechaNacimiento(empleadoDto.getFechaNacimiento())
                .ocupacion(empleadoDto.getOcupacion())
                .telefono(empleadoDto.getTelefono())
                .build();
        return empleadoDao.save(empleado);
    }
    @Transactional(readOnly = true)
    @Override
    public Empleado findById(Integer id) {
        return empleadoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Empleado empleadoDto) {
        Empleado empleado = Empleado.builder()
                .idEmpleado(empleadoDto.getIdEmpleado())
                .nombre(empleadoDto.getNombre())
                .apellido(empleadoDto.getApellido())
                .fechaNacimiento(empleadoDto.getFechaNacimiento())
                .ocupacion(empleadoDto.getOcupacion())
                .telefono(empleadoDto.getTelefono())
                .build();
        empleadoDao.delete(empleado);
    }
}
