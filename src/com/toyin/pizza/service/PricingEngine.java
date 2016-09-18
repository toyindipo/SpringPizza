package com.toyin.pizza.service;

import com.toyin.pizza.domain.Order;

public interface PricingEngine {
  public float calculateOrderTotal(Order order);
}
