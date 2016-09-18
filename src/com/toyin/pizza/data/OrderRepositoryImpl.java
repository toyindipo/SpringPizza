package com.toyin.pizza.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.toyin.pizza.domain.Order;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
	private Map<String, List<Order>> orders = new HashMap<String, List<Order>>();
	
	public void saveOrder(Order order) {
		String custPhoneNumber = order.getCustomer().getPhoneNumber();
		if(orders.containsKey(custPhoneNumber)) {
			orders.get(custPhoneNumber).add(order);
		} else {
			orders.put(custPhoneNumber, new ArrayList<Order>(Arrays.asList(new Order[] {order})));
		}
	}
	
	public List<Order> getCustomerOrders(String phoneNumber) {
		return orders.get(phoneNumber);
	}
}
