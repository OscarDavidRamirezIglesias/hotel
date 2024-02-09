package com.hotel.controller;

import com.hotel.model.dto.EmpleadoDto;
import com.hotel.model.entity.Empleado;
import com.hotel.service.IEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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
    public ResponseEntity<?> delete(@PathVariable Integer id){
        Map<String, Object> response = new HashMap<>();
        try {
            Empleado empleadoDelete = empleadoService.findById(id);
            empleadoService.delete(empleadoDelete);
            return new ResponseEntity<>(empleadoDelete, HttpStatus.NO_CONTENT);
        }catch (DataAccessException exDt){
            response.put("mensaje", exDt.getMessage());
            response.put("empleado", null);
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("empleado/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Empleado showById(@PathVariable Integer id){
        return empleadoService.findById(id);
    }
}
