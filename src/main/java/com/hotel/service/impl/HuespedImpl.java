package com.hotel.service.impl;

import com.hotel.model.dao.HuespedDao;
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
    public Huesped save(Huesped huesped) {
        return huespedDao.save(huesped);
    }
    @Transactional(readOnly = true)
    @Override
    public Huesped findById(Integer id) {
        return huespedDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Huesped huesped) {
        huespedDao.delete(huesped);
    }
}
