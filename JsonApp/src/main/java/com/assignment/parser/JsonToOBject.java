package com.assignment.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.assignment.classes.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToOBject {

	public static void main(String[] args) throws IOException {
		
		byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Sandeep Manchala\\Desktop\\CustomerInfo.json"));
        ObjectMapper oMapper = new ObjectMapper();
        Customer c = oMapper.readValue(jsonData, Customer.class); 
        System.out.println("Customer Object is: \n" +c);

	}

}
