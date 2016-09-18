package com.toyin.pizza.domain;

@SuppressWarnings("serial")
public class CashOrCheckPayment extends Payment {
  public CashOrCheckPayment() {}
  
  public String toString() {
    return "CASH or CHECK:  $" + getAmount();
  }
}
