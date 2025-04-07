
package com.pavan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.dao.ICoronaVaccineRepo;

@Service(value="service")
public class CoronoVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {
	
	@Autowired
	private ICoronaVaccineRepo repo;

}
