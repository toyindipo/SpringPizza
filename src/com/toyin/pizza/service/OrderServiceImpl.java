package com.toyin.pizza.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.toyin.pizza.data.OrderRepository;
import com.toyin.pizza.domain.Order;

public class OrderServiceImpl {
  private static final Logger LOGGER = 
      Logger.getLogger(OrderServiceImpl.class);
  private OrderRepository orderRepository;
  @Autowired
  public OrderServiceImpl(OrderRepository orderRepository) {
    this.orderRepository = orderRepository; 
  }
  
  public void saveOrder(Order order) {
    LOGGER.debug("SAVING ORDER:  " );
    LOGGER.debug("   Customer:  " + order.getCustomer().getName());
    LOGGER.debug("   # of Pizzas:  " + order.getPizzas().size());
    LOGGER.debug("   Payment:  " + order.getPayment());
    orderRepository.saveOrder(order);
  }
}
