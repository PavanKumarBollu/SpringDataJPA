package com.pavan.service;

import java.util.List;

import com.pavan.bo.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public String registerVacine(CoronaVaccine vaccine);
	public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccines);
	public Long getVaccineCount();
	public boolean checkAvailablityByRegNo(Long regNo);
	public Iterable<CoronaVaccine> fetchAllDetails();
	public Iterable<CoronaVaccine> fetchAllDetailsByID(List<Long> ids);
}
