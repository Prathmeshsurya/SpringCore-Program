package com.Mini.Payment;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShoppingConfiguration {
	@Autowired
	Environment environment;
        @Bean
	 public Paytem Paytem() {
		 Paytem Paytem = new Paytem();
		return Paytem;
		 
	 }
        @Bean
	 public PhonePay PhonePay() {
		 PhonePay PhonePay = new PhonePay();
		return PhonePay;
		 
	 }
        @Bean
	 public GooglePay GooglePay() {
		 GooglePay GooglePay = new GooglePay();
		 return GooglePay;
	 }
        @Bean
	 public Card Card() 
	 {
		 Card Card = new Card();
		 return Card;
	 }
}
