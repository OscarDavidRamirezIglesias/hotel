package com.hotel.controller;

import com.hotel.model.dto.EmpleadoDto;
import com.hotel.model.entity.Empleado;
import com.hotel.service.IEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EmpleadoController {

    @Autowired
    private IEmpleado empleadoService;

    @PostMapping("empleado")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado create(@RequestBody EmpleadoDto empleado){
        return empleadoService.save(empleado);
    }

    @PutMapping("empleado")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado update(@RequestBody EmpleadoDto empleado){
        return empleadoService.save(empleado);
    }

    @DeleteMapping("empleado/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        Empleado empleadoDelete = empleadoService.findById(id);
        empleadoService.delete(empleadoDelete);
    }

    @GetMapping("empleado/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Empleado showById(@PathVariable Integer id){
        return empleadoService.findById(id);
    }
}
