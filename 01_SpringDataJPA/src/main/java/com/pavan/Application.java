package com.pavan;

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
		ICoronaVaccineMgmtService serviceImpl = context.getBean(CoronoVaccineMgmtServiceImpl.class);

		// RegisterVacine Method

		/*
		 * CoronaVaccine vaccine = new CoronaVaccine(null, "covidshield", "serum",
		 * "IND", 750.0, 2); String vaccineRegistationStatus =
		 * serviceImpl.registerVacine(vaccine);
		 * System.out.println(vaccineRegistationStatus);
		 */

		// RegisterInBatch Method

		/*
		 * List<CoronaVaccine> vacines = new ArrayList<CoronaVaccine>(); vacines.add(new
		 * CoronaVaccine(null, "sputnik", "russie", "Russia", 567.8, 2));
		 * vacines.add(new CoronaVaccine(null, "pyzer", "pyzwer", "USA", 678.8, 2));
		 * vacines.add(new CoronaVaccine(null, "moderena", "moderena", "USA", 455.8,
		 * 2));
		 * 
		 * Iterable<CoronaVaccine> registerInBatch =
		 * serviceImpl.registerInBatch(vacines); registerInBatch.forEach(vacine -> {
		 * System.out.println(vacine.getRegNo()); });
		 */

		// total number of Vaccine

		/*
		 * Long totalCount = serviceImpl.getVaccineCount();
		 * System.out.println("Total Vaccies Count in the Table is :: " + totalCount);
		 */

		// Finding Vaccine By Id

		/*
		 * System.out.println( "Checking The Availability Of Vaccine With Id :: 3 ->  "
		 * + serviceImpl.checkAvailablityByRegNo(3l));
		 */
		
		// Finding all the Vaccines in the Table
		
		serviceImpl.fetchAllDetails().forEach(System.out::println);
		
		
		
		
		
		
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
