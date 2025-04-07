
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
	public List<CoronaVaccine> findByCompany(String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoronaVaccine> findByCompanyEquals(String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoronaVaccine> findByCompanyIs(String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoronaVaccine> findByPriceLessThan(Double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoronaVaccine> findByCountryInAndPriceBetween(Collection<String> countries, double startRange,
			double endRange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoronaVaccine> findByCountryNotIn(Collection<String> countries) {
		// TODO Auto-generated method stub
		return null;
	}

}
