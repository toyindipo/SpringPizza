package com.toyin.pizza.data;

import java.util.List;

import com.toyin.pizza.domain.Order;

public interface OrderRepository {
	void saveOrder(Order order);
	List<Order> getCustomerOrders(String phoneNumber);
}
