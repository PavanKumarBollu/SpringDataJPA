
package com.pavan.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.bo.CoronaVaccine;
import com.pavan.dao.ICoronaVaccineRepo;

@Service(value="service")
public class CoronoVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {
	
	@Autowired
	private ICoronaVaccineRepo repo;

	

	@Override
	public List<CoronaVaccine> fetchVaccineByCompany(String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoronaVaccine> fetchVaccineByPricesLessThan(Double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoronaVaccine> searchVaccineByCountriesAndPriceRange(List<String> countires, double startRange,
			double endRange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoronaVaccine> fetchVaccineNotByCountry(List<String> countries) {
		// TODO Auto-generated method stub
		return null;
	}

}
