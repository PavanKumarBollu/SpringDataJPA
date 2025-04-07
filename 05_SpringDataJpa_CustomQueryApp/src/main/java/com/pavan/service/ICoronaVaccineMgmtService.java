package com.pavan.service;

import java.util.Collection;
import java.util.List;

import com.pavan.bo.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public List<CoronaVaccine> findByCompany(String company);

	public List<CoronaVaccine> findByCompanyEquals(String company);

	public List<CoronaVaccine> findByCompanyIs(String company);

	public List<CoronaVaccine> findByPriceLessThan(Double price);

	public List<CoronaVaccine> findByCountryInAndPriceBetween(Collection<String> countries, double startRange,
			double endRange);

	public List<CoronaVaccine> findByCountryNotIn(Collection<String> countries);
}
