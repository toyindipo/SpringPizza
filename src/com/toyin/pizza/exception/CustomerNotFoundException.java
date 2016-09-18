package com.toyin.pizza.exception;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {
  public CustomerNotFoundException() {}
  
  public CustomerNotFoundException(String message) {
    super(message);
  }
}
