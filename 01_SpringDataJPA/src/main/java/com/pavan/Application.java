package com.pavan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pavan.bo.Patient;
import com.pavan.service.IPatientMgmtService;
import com.pavan.service.PatientServiceMgmtImpl;

@SpringBootApplication
public class Application {

 	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		 IPatientMgmtService service = context.getBean(PatientServiceMgmtImpl.class);
		
		 
		 String dateFormat = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		 
		 
		 Patient patient = new Patient(21, "EMP144", "Ravi", "K", dateFormat, "male", "1234563212", "ravi@gmail.com", "5.9feet", "70kg", "A+", dateFormat, dateFormat);
		 
		 String patientRegisterStatus = service.registerPatient(patient);
		 System.out.println(patientRegisterStatus);
		
		
		
		
		
		
		
		
		
		
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
