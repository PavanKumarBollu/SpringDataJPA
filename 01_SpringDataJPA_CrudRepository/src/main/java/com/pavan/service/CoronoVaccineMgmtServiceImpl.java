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

	@Override
	public String removeVaccineById(Long id) {
		Optional<CoronaVaccine> vaccine = repo.findById(id);
		if(vaccine.isPresent())
		{		
			repo.deleteById(id);;
			return "record deleted having id:: " + id;
		}
		else
			return "record not avaialble for deletion with the id ::" + id;
	}

	@Override
	public String removeVaccineByObject(CoronaVaccine vacine) {
		Optional<CoronaVaccine> optional = repo.findById(vacine.getRegNo());
		if(optional.isPresent())
		{
			repo.delete(vacine);
			return "Record deleted with the given id:: " + vacine.getRegNo();
		}
		return "Record not available for deletion with the given id :: " + vacine.getRegNo();
	}

	@Override
	public String removeVaccinesByIds(List<Long> ids) {
		@SuppressWarnings("unchecked")
		List<CoronaVaccine> iterable =(List<CoronaVaccine>) repo.findAllById(ids);
		if(iterable.size() == ids.size()) {
			repo.deleteAllById(ids);
			return ids.size() + " no of ids are deleted....";
		}
		return "Problem in deleting records";
		
	}

}
