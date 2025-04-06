package com.pavan.dao;

import org.springframework.data.repository.CrudRepository;

import com.pavan.bo.Patient;

public interface IPatientRepo extends CrudRepository<Patient, Long> {

}
