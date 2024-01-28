package com.hotel.controller;

import com.hotel.model.entity.Huesped;
import com.hotel.service.IHuesped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HuespedController {

    @Autowired
    private IHuesped huespedService;

    @PostMapping("huesped")
    @ResponseStatus(HttpStatus.CREATED)
    public Huesped create(@RequestBody Huesped huesped){
        return huespedService.save(huesped);
    }

    @PutMapping("huesped")
    @ResponseStatus(HttpStatus.CREATED)
    public Huesped update(@RequestBody Huesped huesped){
        return huespedService.save(huesped);
    }

    @DeleteMapping("huesped/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        Huesped huespedDelete = huespedService.findById(id);
        huespedService.save(huespedDelete);
    }

    @GetMapping("huesped/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Huesped showById(@PathVariable Integer id){
        return huespedService.findById(id);
    }

}
