package com.toyin.pizza.data;

import com.toyin.pizza.domain.Customer;
import com.toyin.pizza.exception.CustomerNotFoundException;

public interface CustomerRepository {
	void addCustomer(Customer customer);
	Customer lookUpCustomer(String phoneNumber) throws CustomerNotFoundException;
}
