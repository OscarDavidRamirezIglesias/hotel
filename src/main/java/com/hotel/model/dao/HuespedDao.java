package com.hotel.model.dao;

import com.hotel.model.entity.Huesped;
import org.springframework.data.repository.CrudRepository;

public interface HuespedDao extends CrudRepository<Huesped, Integer> {
}
