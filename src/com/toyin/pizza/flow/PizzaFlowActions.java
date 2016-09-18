package com.toyin.pizza.flow;

import static com.toyin.pizza.domain.PaymentType.*;
import static org.apache.log4j.Logger.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.toyin.pizza.domain.CashOrCheckPayment;
import com.toyin.pizza.domain.CreditCardPayment;
import com.toyin.pizza.domain.Customer;
import com.toyin.pizza.domain.Order;
import com.toyin.pizza.domain.Payment;
import com.toyin.pizza.domain.PaymentDetails;
import com.toyin.pizza.exception.CustomerNotFoundException;
import com.toyin.pizza.service.CustomerService;
import com.toyin.pizza.service.OrderServiceImpl;

@Component
public class PizzaFlowActions {
  private static final Logger LOGGER = getLogger(PizzaFlowActions.class);
  
   public Customer lookupCustomer(String phoneNumber) 
         throws CustomerNotFoundException {     
      return customerService.lookupCustomer(phoneNumber);      
   }
   
   public void addCustomer(Customer customer) {
      customerService.addCustomer(customer);
   }

   public Payment verifyPayment(PaymentDetails paymentDetails) {
     Payment payment = null;
     if(paymentDetails.getPaymentType() == CREDIT_CARD) {
       payment = new CreditCardPayment();
     } else {
       payment = new CashOrCheckPayment();
     }
     
     return payment;
   }
   
   public void saveOrder(Order order) {
	   orderService.saveOrder(order);
   }
   
   public boolean checkDeliveryArea(String zipCode) {
     LOGGER.warn("TODO: Flesh out the checkDeliveryArea() method.");
     String[] areaCodes = {"20001", "20002", "20003", "20004"};
     boolean found = false;
     
     for(String code: areaCodes) {
    	 if(code.equals(zipCode)) {
    		 found = true;
    		 break;
    	 }
     }
     
     return found;
   }

   @Autowired
   CustomerService customerService;
   
   @Autowired
   private OrderServiceImpl orderService;
}
