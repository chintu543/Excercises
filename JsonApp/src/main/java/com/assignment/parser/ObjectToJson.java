package com.assignment.parser;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;

import com.assignment.classes.Address;
import com.assignment.classes.Customer;
import com.assignment.classes.PaymentMethod;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ObjectToJson {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, FileNotFoundException, IOException {
		
		ObjectMapper oMapper = new ObjectMapper();
        Customer cust = createCustomer();
        oMapper.enable(SerializationFeature.INDENT_OUTPUT);
        oMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        oMapper.writeValue(System.out, cust);
        oMapper.writeValue(new PrintWriter("C:\\Users\\Sandeep Manchala\\Desktop\\CustomerInfo.json"), cust);
	}

	private static Customer createCustomer() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(1994, 07, 06);
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2018, 01, 01);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2022, 8, 15);

		Customer c = new Customer();
		c.setCustomerId(3);
		c.setName("Jimmy");
		c.setDateOfBirth(cal.getTime());
		c.setAnualSalary(75000);
		
		Address address = new Address();
		address.setStreet("John Kirk drive");
		address.setAptNo(43);
		address.setCity("Dallas");
		address.setState("Texas");
		address.setZip(75063);
		
		c.setAddress(address);
		
		PaymentMethod pm = new PaymentMethod();
		pm.setCardNumber(458586987);
		pm.setCardName("XYZ");
		pm.setDatefrom(cal1.getTime());
		pm.setDateTo(cal2.getTime());
		
		List<String> cardType = new ArrayList<String>();
		cardType.add("CreditCard");
//		cardType.add("DebitCard");
		pm.setCardType(cardType);
		
		c.setPaymentMethod(pm);
		
		return c;
	}

	
	
	
}
