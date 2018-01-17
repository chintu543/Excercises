package com.assignment.classes;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class PaymentMethod {
	
	private long cardNumber;
	private String cardName;
	private Date datefrom;
	private Date dateTo;
	private List<String> cardType;
	
}
