package com.pavan.service;

import java.util.List;

import com.pavan.bo.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public List<CoronaVaccine> fetchVaccineByCompany(String company);

	public List<CoronaVaccine> fetchVaccineByPricesLessThan(Double price);

	public List<CoronaVaccine> searchVaccineByCountriesAndPriceRange(List<String> countires, double startRange,
			double endRange);

	public List<CoronaVaccine> fetchVaccineNotByCountry(List<String> countries);
}
