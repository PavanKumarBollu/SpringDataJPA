package com.pavan.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pavan.bo.CoronaVaccine;

public interface ICoronaVaccineRepo extends PagingAndSortingRepository<CoronaVaccine, Long> {

}
