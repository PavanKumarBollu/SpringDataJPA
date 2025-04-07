package com.pavan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.bo.Customer;
import com.pavan.dao.ICustomerDao;

@Service(value="service")
public class CustomerMgmtServieImpl implements ICustomerMgmtService {

	@Autowired
	private ICustomerDao dao;
	
	
	@Override
	public String registerCustomer(Customer customer) {
		Customer customer2 = dao.save(customer);
		
		Integer cid = customer2.getCid();	
		return "Customer Registerd With ID : " + cid;
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customer = (List<Customer>) dao.findAll();
		return customer;
	}

}
