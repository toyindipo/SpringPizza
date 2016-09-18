package com.toyin.pizza.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.toyin.pizza.domain.Customer;
import com.toyin.pizza.exception.CustomerNotFoundException;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
	private List<Customer> customers = new ArrayList<Customer>();
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public Customer lookUpCustomer(String phoneNumber) throws CustomerNotFoundException {
		Customer result = null;
		
		for(Customer customer: customers) {
			if(customer.getPhoneNumber().equals(phoneNumber)){
				result = customer;
				break;
			}
		}
		
		if(result != null) {
			return result;
		} else {
			throw new CustomerNotFoundException();
		}
	}
}
