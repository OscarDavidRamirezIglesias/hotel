package com.hotel.service;

import com.hotel.model.entity.Huesped;

public interface IHuesped {

    Huesped save(Huesped huesped);

    Huesped findById(Integer id);

    void delete(Huesped huesped);
}
