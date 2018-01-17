package com.assignment.classes;

import java.util.Date;

import lombok.Data;

@Data
public class Customer {
	
	private int customerId;
	private String name;
	private Date dateOfBirth;
	private double anualSalary;
	private Address address;
	private PaymentMethod paymentMethod;
	

}
