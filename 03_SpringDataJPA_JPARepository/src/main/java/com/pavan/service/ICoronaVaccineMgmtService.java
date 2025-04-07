package com.pavan.service;

import java.util.List;

import com.pavan.bo.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public List<CoronaVaccine> searchVaccinesByGivenData(CoronaVaccine vaccine, boolean ascOrder,String... properties);
}
