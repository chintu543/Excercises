package org.AirlineRepositories;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="flightdetails")
public class FlightDetails {

	private int flightId;
	private String flightDepartureDate;
	private float price;
	private int availableSeats;
	
	
	public FlightDetails() {
		super();
	}
	
	public FlightDetails(int flightId, String flightDepartureDate, float price, int availableSeats) {
		super();
		this.flightId = flightId;
		this.flightDepartureDate = flightDepartureDate;
		this.price = price;
		this.availableSeats = availableSeats;
	}
	
	@Override
	public String toString() {
		return "FlightDetails [flightId=" + flightId + ", flightDepartureDate=" + flightDepartureDate + ", price="
				+ price + ", availableSeats=" + availableSeats + "]";
	}

	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightDepartureDate() {
		return flightDepartureDate;
	}
	public void setFlightDepartureDate(String flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
}
