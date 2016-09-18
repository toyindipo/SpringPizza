package com.toyin.pizza.domain;

import java.io.Serializable;

public enum PizzaSize implements Serializable {
  SMALL(6.99f), MEDIUM(7.99f), LARGE(8.99f), GINORMOUS(9.99f);
	
  private final float amount;
  
  PizzaSize(float amount) {
	  this.amount = amount;
  }
  
  public float getAmount() {
	  return amount;
  }
}
