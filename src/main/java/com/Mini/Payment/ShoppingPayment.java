package com.Mini.Payment;

public class ShoppingPayment {
 
	 private iPayment payment;
	 
	 public void payment() {
		 iPayment paymentMode = null;
		 // QRcode & card No verification 
		 if(paymentMode.paymentVerification()) {
			 System.out.println("Payment Successful Through ");
		 }
	 }
}
