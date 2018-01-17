package com.assignment.classes;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Data
public class Address {
	
	private String street;
	private int AptNo;
	private String city;
	private String state;
	private int Zip;

}
