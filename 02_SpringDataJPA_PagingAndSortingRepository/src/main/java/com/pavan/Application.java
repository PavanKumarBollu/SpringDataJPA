package com.pavan;

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
		
		ICoronaVaccineMgmtService service = context.getBean(CoronoVaccineMgmtServiceImpl.class);
		
		
		/*
		 * Iterable<CoronaVaccine> fetchDetails = service.fetchDetails(true, "price",
		 * "name"); fetchDetails.forEach(vaccine->{ System.out.println(
		 * vaccine.getName() + " == " + vaccine.getPrice()); });
		 */
		
		
		/*
		 *	service.fetchDetailsByPageNo(1, 2, false, "company", "price").forEach(System.out::println);
		 * 
		 */
		
		service.fetchDetailsByPagination(5);
		
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
