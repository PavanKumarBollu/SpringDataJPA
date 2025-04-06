package com.pavan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.pavan.bo.CoronaVaccine;
import com.pavan.dao.ICoronaVaccineRepo;

@Service(value = "service")
public class CoronoVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... properties) {
		System.out.println("Implementation Class name of the proxy class :: " + repo.getClass().getName());
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC,properties);
		return repo.findAll(sort);
	}

	@Override
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties) {
		Pageable pageRequest = PageRequest.of(pageNo, pageSize, asc?Direction.ASC : Direction.DESC, properties);
		Page<CoronaVaccine> page = repo.findAll(pageRequest);
		return page;
	}

	@Override
	public void fetchDetailsByPagination(int pageSize) {
		
		

	}

}
