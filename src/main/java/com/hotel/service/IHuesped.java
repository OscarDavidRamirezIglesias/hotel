package com.hotel.service;

import com.hotel.model.dto.HuespedDto;
import com.hotel.model.entity.Huesped;

public interface IHuesped {

    Huesped save(HuespedDto huesped);

    Huesped findById(Integer id);

    void delete(Huesped huesped);
}
