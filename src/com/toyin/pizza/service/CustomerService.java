package com.toyin.pizza.service;
import com.toyin.pizza.domain.Customer;
import com.toyin.pizza.exception.CustomerNotFoundException;

public interface CustomerService {
   Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
   void addCustomer(Customer customer);
}