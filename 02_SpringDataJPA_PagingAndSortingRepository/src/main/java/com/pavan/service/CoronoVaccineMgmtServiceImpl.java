package com.pavan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.bo.CoronaVaccine;
import com.pavan.dao.ICoronaVaccineRepo;

@Service(value="service")
public class CoronoVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo repo;
	
	
	@Override
	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... properties) {
		return null;
	}


	@Override
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void fetchDetailsByPagination(int pageSize) {
		// TODO Auto-generated method stub
		
	}

}
