package com.pavan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pavan.service.CoronoVaccineMgmtServiceImpl;
import com.pavan.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		ICoronaVaccineMgmtService service = context.getBean(CoronoVaccineMgmtServiceImpl.class);
		
		/*
		 * CoronaVaccine vaccine = new CoronaVaccine(); vaccine.setName("Vaxzevria");
		 * List<CoronaVaccine> data = service.searchVaccinesByGivenData(vaccine, true,
		 * "regNo","name", "price"); data.forEach(System.out::println);
		 */
		
		
		
		/*
		 * try { CoronaVaccine vaccineById = service.getVaccineById(10l); if(vaccineById
		 * != null) { System.out.println("Vaccine Details are :: " + vaccineById); }
		 * else { System.out.println("Vaccine Not Found for the Given Id :: "); } }
		 * catch (DataAccessException e) { System.out.println(e.getMessage()); }
		 */
		
		
		List<Long> list = new ArrayList<Long>();
		list.add(47l);
		list.add(48l);
		list.add(49l);
		String removeVaccinesByRegNo = service.removeVaccinesByRegNo(list);
		System.out.println(removeVaccinesByRegNo);
		
		
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
