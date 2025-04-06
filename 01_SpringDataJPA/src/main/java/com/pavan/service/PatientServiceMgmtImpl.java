package com.pavan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.bo.Patient;
import com.pavan.dao.IPatientRepo;

@Service("service")
public class PatientServiceMgmtImpl implements IPatientMgmtService {

	@Autowired
	private IPatientRepo repo;

	@Override
	public String registerPatient(Patient patient) {
		System.out.println("In Memory Proxy Class Is :: " + repo.getClass().getName());

		Patient newPatient = null;
		if (patient != null) {
			newPatient = repo.save(patient);
		}

		return newPatient != null ? "patient registered succesfully with " + newPatient.getPatientId()
				: "patient registration failed";
	}

}
