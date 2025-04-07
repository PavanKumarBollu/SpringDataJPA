package com.pavan;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pavan.bo.Customer;
import com.pavan.service.CustomerMgmtServieImpl;
import com.pavan.service.ICustomerMgmtService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		 ICustomerMgmtService servieImpl = context.getBean(CustomerMgmtServieImpl.class);
		
		 Customer customer = new Customer(1, "pavan", "hyderabad", LocalDateTime.of(2001, 8, 23, 6, 15), LocalTime.of(10, 15), LocalDate.now());
		 
		 servieImpl.registerCustomer(customer);
		
		((ConfigurableApplicationContext) context).close();
	}

}
