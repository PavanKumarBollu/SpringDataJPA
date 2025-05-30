package com.pavan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	public List<CoronaVaccine> searchVaccinesByGivenData(CoronaVaccine vaccine, boolean ascOrder,
			String... properties) {

		Example<CoronaVaccine> example = Example.of(vaccine);
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, properties);
		List<CoronaVaccine> all = repo.findAll(example, sort);

		return all;
	}

	@SuppressWarnings("deprecation")
	@Override
	public CoronaVaccine getVaccineById(Long regNo) {

		return repo.getById(regNo);
	}

	@Override
	public String removeVaccinesByRegNo(Iterable<Long> regNo) {
		List<CoronaVaccine> list = repo.findAllById(regNo);
		if(list.size()!=0)
		{
			repo.deleteAllByIdInBatch(regNo);
			return list.size() + " no of records are deleted";
		}
		
		return "records not available to delete";
	}

}
