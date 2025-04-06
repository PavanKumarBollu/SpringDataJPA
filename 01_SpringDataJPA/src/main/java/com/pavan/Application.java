package com.pavan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pavan.bo.CoronaVaccine;
import com.pavan.service.CoronoVaccineMgmtServiceImpl;
import com.pavan.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class Application {

 	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		ICoronaVaccineMgmtService serviceImpl = context.getBean(CoronoVaccineMgmtServiceImpl.class);
		
		
		// RegisterVacine Method
		
		/*
		 * CoronaVaccine vaccine = new CoronaVaccine(null, "covidshield", "serum",
		 * "IND", 750.0, 2); String vaccineRegistationStatus =
		 * serviceImpl.registerVacine(vaccine);
		 * System.out.println(vaccineRegistationStatus);
		 */
		
		// RegisterInBatch Method
		
		List<CoronaVaccine> vacines = new ArrayList<CoronaVaccine>();
		vacines.add(new CoronaVaccine(null, "sputnik", "russie", "Russia", 567.8, 2));
		
		Iterable<CoronaVaccine> registerInBatch = serviceImpl.registerInBatch(vacines);
		registerInBatch.forEach(vacine -> {
			System.out.println(vacine.getRegNo());
		});
		
		
		
		
		
		
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
