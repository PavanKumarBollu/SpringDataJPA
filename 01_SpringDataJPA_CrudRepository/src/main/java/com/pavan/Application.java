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
		
		/*
		 * serviceImpl.fetchAllDetails().forEach(System.out::println);
		 */
		
		
		// finding multiple corona vacines by passing the multiple ids
		
		/*
		 * List<Long> ids = new ArrayList<Long>(); ids.add(2l); ids.add(1l);
		 * ids.add(3l);
		 * 
		 * serviceImpl.fetchAllDetailsByID(ids).forEach(vaccine -> {
		 * System.out.println("vaccine Name : " + vaccine.getName() +
		 * " vaccine Price : " + vaccine.getPrice()); });
		 */
		
		
		// finding single vaccine by using the id
		
		/*
		 * //case:1 Optional<CoronaVaccine> fetchVaccineById =
		 * serviceImpl.fetchVaccineById(2l); if(fetchVaccineById.isPresent())
		 * System.out.println(fetchVaccineById.get()); else throw new
		 * IllegalArgumentException("Record not found for the Given Id::"); //case:2
		 * System.out.println(serviceImpl.fetchVaccineById(10l).orElse(new
		 * CoronaVaccine()));
		 * 
		 * 
		 * //case:3
		 * System.out.println(serviceImpl.fetchVaccineById(12l).orElseGet(()->new
		 * CoronaVaccine()));
		 * 
		 */
		
		/*
		 * // Removing the vaccine by id String removeVaccineById =
		 * serviceImpl.removeVaccineById(3l); System.out.println(removeVaccineById +
		 * " Vaccine Removed by using the Id");
		 */
		
		/*
		 * // removing the vaccine by Vaccine object String removeVaccineByObject =
		 * serviceImpl.removeVaccineByObject(new CoronaVaccine(5l, "sputnik", "russie",
		 * "Russia", 567.8, 2)); System.out.println(removeVaccineByObject +
		 * " Vaccine Removed By using the Vaccine Object");
		 */
		
		/*
		 * //remove the Vaccine by Ids List<Long> vaccineIds = new ArrayList<Long>();
		 * vaccineIds.add(6l); vaccineIds.add(7l); String removeVaccinesByIds =
		 * serviceImpl.removeVaccinesByIds(vaccineIds);
		 * System.out.println(removeVaccinesByIds +
		 * " Vaccines are removed by using the IdS");
		 * 
		 */
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
