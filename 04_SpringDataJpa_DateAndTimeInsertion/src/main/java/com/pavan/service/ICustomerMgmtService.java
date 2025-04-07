package com.pavan.service;

import java.util.List;

import com.pavan.bo.Customer;

public interface ICustomerMgmtService {
	public String registerCustomer(Customer customer);
	public List<Customer> getAllCustomers();
}
