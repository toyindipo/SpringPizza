package com.toyin.pizza.service;

import java.io.Serializable;

import org.apache.log4j.Logger;

import com.toyin.pizza.domain.Order;
import com.toyin.pizza.domain.Pizza;

@SuppressWarnings("serial")
public class PricingEngineImpl 
    implements PricingEngine, Serializable {
  private static final Logger LOGGER = 
      Logger.getLogger(PricingEngineImpl.class);
 
  private static float PRICE_PER_TOPPING = 0.20f;
  
  public PricingEngineImpl() {}
  
  public float calculateOrderTotal(Order order) {
    LOGGER.debug("Calculating order total");
    
    float total = 0.0f;
    
    for (Pizza pizza : order.getPizzas()) {
      float pizzaPrice = pizza.getSize().getAmount();
      if(pizza.getToppings().size() > 2) {
        pizzaPrice += (pizza.getToppings().size() * 
            PRICE_PER_TOPPING);
      }
      total += pizzaPrice;
    }
    
    return total;
  }
}
