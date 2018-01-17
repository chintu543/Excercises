package com.assignment.JaxbApp;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.assignment.Customer.Address;
import com.assignment.Customer.Customer;
import com.assignment.Customer.PaymentMethod;

public class CustMarshaller {

	public static void main(String[] args) throws DatatypeConfigurationException {
		try {
			
			File file = new File("C:\\Users\\Sandeep Manchala\\Desktop\\CustomerInfo.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			Customer c = createCustomer();
			jaxbMarshaller.marshal(c, file);
			jaxbMarshaller.marshal(c, System.out);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	private static Customer createCustomer() throws DatatypeConfigurationException {
	
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2018, 01, 01);
		XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		
		GregorianCalendar Gc = new GregorianCalendar();
		gc.set(2022, 8, 10);
		XMLGregorianCalendar dateto = DatatypeFactory.newInstance().newXMLGregorianCalendar(Gc);
		
		Customer cust = new Customer();
		cust.setCustomerId(2);
		cust.setName("Aditya");
		cust.setDateofBirth(date2);
		cust.setAnnualSalary(5500);
		
		Address address = new Address();
		address.setStreet("John krik drive");
		address.setAptNo(43);
		address.setCity("Dallas");
		address.setState("Texas");
		address.setZip(75063);
		cust.setAddress(address);
		
		PaymentMethod pm = new PaymentMethod();
		pm.setCardNumber(451247845);
		pm.setCardName("XYZ");
		pm.setDateFrom(date);
		pm.setDateTo(dateto);
		pm.setPaymentMethod("Creditcard");
		cust.setPaymentMethod(pm);
		
		return cust;
	}

}
