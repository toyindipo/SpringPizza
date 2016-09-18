package com.toyin.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.toyin.pizza.data.CustomerRepository;
import com.toyin.pizza.domain.Customer;
import com.toyin.pizza.exception.CustomerNotFoundException;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
      this.customerRepository = customerRepository;
	}
  
  public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
    return customerRepository.lookUpCustomer(phoneNumber);
  }
  
  public void addCustomer(Customer customer) {
	  customerRepository.addCustomer(customer);
  }
}
