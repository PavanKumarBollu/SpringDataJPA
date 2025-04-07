package com.pavan.dao;

import org.springframework.data.repository.CrudRepository;

import com.pavan.bo.Customer;

public interface ICustomerDao extends CrudRepository<Customer, Long>{

}
