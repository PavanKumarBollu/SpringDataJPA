package com.pavan.dao;

import org.springframework.data.repository.CrudRepository;

import com.pavan.bo.CoronaVaccine;

public interface ICoronaVaccineRepo extends CrudRepository<CoronaVaccine, Long> {

}
