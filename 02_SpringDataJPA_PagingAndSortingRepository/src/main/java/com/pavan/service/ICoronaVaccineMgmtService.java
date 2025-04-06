package com.pavan.service;

import com.pavan.bo.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... properties);
}
