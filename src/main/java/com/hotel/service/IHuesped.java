package com.hotel.service;

public interface IHuesped {

    Huesped save(Huesped huesped);

    Huesped findBiId(Integer id);

    void delete(Huesped huesped);
}
