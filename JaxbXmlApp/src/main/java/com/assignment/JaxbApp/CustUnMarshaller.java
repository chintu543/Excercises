package com.assignment.JaxbApp;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.assignment.Customer.Customer;

public class CustUnMarshaller {

	public static void main(String[] args) throws DatatypeConfigurationException{

		try {

			File file = new File("C:\\Users\\Sandeep Manchala\\Desktop\\CustomerInfo.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			Customer cust = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(ReflectionToStringBuilder.toString(cust));
		 }   
		catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
