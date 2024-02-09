package com.hotel.service.impl;

import ch.qos.logback.core.net.server.Client;
import com.hotel.model.dao.HuespedDao;
import com.hotel.model.dto.HuespedDto;
import com.hotel.model.entity.Huesped;
import com.hotel.service.IEmpleado;
import com.hotel.service.IHuesped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HuespedImpl implements IHuesped {

    @Autowired
    private HuespedDao huespedDao;

    @Override
    @Transactional
    public Huesped save(HuespedDto huespedDto) {
        Huesped huesped = Huesped.builder()
                .idHuesped(huespedDto.getIdHuesped())
                .nombre(huespedDto.getNombre())
                .apellido(huespedDto.getApellido())
                .fechaNacimiento(huespedDto.getFechaNacimiento())
                .telefono(huespedDto.getTelefono())
                .reservas(huespedDto.getReservas())
                .build();
        return huespedDao.save(huesped);
    }
    @Transactional(readOnly = true)
    @Override
    public Huesped findById(Integer id) {
        return huespedDao.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(Huesped huesped) {
        huespedDao.delete(huesped);
    }
}
