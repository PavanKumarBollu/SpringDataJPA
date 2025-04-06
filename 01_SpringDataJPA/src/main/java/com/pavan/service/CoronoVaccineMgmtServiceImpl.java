package com.pavan.service;

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
	public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccine) {
		return null;
	}

}
