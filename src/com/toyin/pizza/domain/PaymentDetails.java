package com.toyin.pizza.domain;

import java.io.Serializable;

public class PaymentDetails implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private PaymentType paymentType;
  private String creditCardNumber;

  public PaymentType getPaymentType() {
    return paymentType;
  }
  
  public void setPaymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  //Added by me
  public void setPaymentType(String paymentType) {
    this.paymentType = PaymentType.valueOf(paymentType);
  }
  
  public String getCreditCardNumber() {
    return creditCardNumber;
  }
  
  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }  
}
