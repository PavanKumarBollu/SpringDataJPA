package com.pavan;

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
		
		ICoronaVaccineMgmtService service = context.getBean(CoronoVaccineMgmtServiceImpl.class);
		
		CoronaVaccine vaccine = new CoronaVaccine();
		vaccine.setName("Vaxzevria");
		List<CoronaVaccine> data = service.searchVaccinesByGivenData(vaccine, true, "name", "price");
		data.forEach(System.out::println);
		
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
