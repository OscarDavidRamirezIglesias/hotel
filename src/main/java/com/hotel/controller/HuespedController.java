package com.hotel.controller;

import com.hotel.model.dto.HuespedDto;
import com.hotel.model.entity.Huesped;
import com.hotel.service.IHuesped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1")
public class HuespedController {

    @Autowired
    private IHuesped huespedService;

    @PostMapping("huesped")
    @ResponseStatus(HttpStatus.CREATED)
    public HuespedDto create(@RequestBody HuespedDto huespedDto){
        Huesped huespedSave = huespedService.save(huespedDto);
        return HuespedDto.builder()
                .idHuesped(huespedSave.getIdHuesped())
                .nombre(huespedSave.getNombre())
                .apellido(huespedSave.getApellido())
                .fechaNacimiento(huespedSave.getFechaNacimiento())
                .telefono(huespedSave.getTelefono())
                .reservas(huespedSave.getReservas())
                .build();
    }

    @PutMapping("huesped")
    @ResponseStatus(HttpStatus.CREATED)
    public HuespedDto update(@RequestBody HuespedDto huespedDto){
        Huesped huespedUpdate = huespedService.save(huespedDto);
        return HuespedDto.builder()
                .idHuesped(huespedUpdate.getIdHuesped())
                .nombre(huespedUpdate.getNombre())
                .apellido(huespedUpdate.getApellido())
                .fechaNacimiento(huespedUpdate.getFechaNacimiento())
                .telefono(huespedUpdate.getTelefono())
                .reservas(huespedUpdate.getReservas())
                .build();
    }

    @DeleteMapping("huesped/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        Map<String, Object> response = new HashMap<>();
        try {
            Huesped huespedDelete = huespedService.findById(id);
            huespedService.delete(huespedDelete);
            return new ResponseEntity<>(huespedDelete, HttpStatus.NO_CONTENT);
        }catch (DataAccessException exDt){
            response.put("mensaje", exDt.getMessage());
            response.put("huesped", null);
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }


    }

    @GetMapping("huesped/{id}")
    @ResponseStatus(HttpStatus.OK)
    public HuespedDto showById(@PathVariable Integer id){
        Huesped huesped = huespedService.findById(id);
        return HuespedDto.builder()
                .idHuesped(huesped.getIdHuesped())
                .nombre(huesped.getNombre())
                .apellido(huesped.getApellido())
                .fechaNacimiento(huesped.getFechaNacimiento())
                .telefono(huesped.getTelefono())
                .reservas(huesped.getReservas())
                .build();
    }

}
