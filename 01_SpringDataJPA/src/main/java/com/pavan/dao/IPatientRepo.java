package com.pavan.dao;

import org.springframework.data.repository.CrudRepository;

import com.pavan.bo.PatientBo;

public interface IPatientRepo extends CrudRepository<PatientBo, Long> {

}
