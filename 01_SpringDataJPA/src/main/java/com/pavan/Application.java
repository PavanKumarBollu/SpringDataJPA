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
		ICoronaVaccineMgmtService serviceImpl = context.getBean(CoronoVaccineMgmtServiceImpl.class);
		
		
		CoronaVaccine vaccine = new CoronaVaccine(null, "covidshield", "serum", "IND", 750.0, 2);
		String vaccineRegistationStatus = serviceImpl.registerVacine(vaccine);
		System.out.println(vaccineRegistationStatus);
		
		
		
		
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
