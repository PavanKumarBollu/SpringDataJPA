package com.pavan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.bo.CoronaVaccine;
import com.pavan.dao.ICoronaVaccineRepo;

@Service(value = "service")
public class CoronoVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public String registerVacine(CoronaVaccine vaccine) {
		System.out.println("In Memory Proxy Class is :: " + repo.getClass().getName());
		CoronaVaccine saveVaccine = null;

		if (vaccine != null) {
			saveVaccine = repo.save(vaccine);
		}
		return saveVaccine != null ? "vaccine registered succesfully with " + saveVaccine.getRegNo()
				: "vaccine registration failed";

	}

	@Override
	public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccines) {
		if (vaccines != null)
			return repo.saveAll(vaccines);
		else
			throw new IllegalArgumentException("Batch Registration is Failed");
	}

	@Override
	public Long getVaccineCount() {
		return repo.count();
	}

	@Override
	public boolean checkAvailablityByRegNo(Long regNo) {
		return repo.existsById(regNo);

	}

	@Override
	public Iterable<CoronaVaccine> fetchAllDetails() {
		return repo.findAll();
	}

	@Override
	public Iterable<CoronaVaccine> fetchAllDetailsByID(List<Long> ids) {
		return repo.findAllById(ids);
	}

	@Override
	public Optional<CoronaVaccine> fetchVaccineById(Long id) {
		return repo.findById(id);
	}

}
