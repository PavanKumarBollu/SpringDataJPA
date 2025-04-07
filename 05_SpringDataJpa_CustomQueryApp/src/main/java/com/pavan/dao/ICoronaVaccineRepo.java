package com.pavan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.bo.CoronaVaccine;

public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {

}
