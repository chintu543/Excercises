package org.AirlineRepositories;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
	
	@Id
	private int flightId;
	
	private int airlineId;
	private String airlineName;
	private String fromLocation;
	private String tolocation;
	private String departureTime;
	private String arrivalTime;
	private String duration;
	private int totalSeats;
	
	
	public Flight() {
		super();
	}
	
	public Flight(int flightId, int airlineId, String airlineName, String fromLocation, String tolocation,
			String departureTime, String arrivalTime, String duration, int totalSeats) {
		super();
		this.flightId = flightId;
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.fromLocation = fromLocation;
		this.tolocation = tolocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.totalSeats = totalSeats;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlineId=" + airlineId + ", airlineName=" + airlineName
				+ ", fromLocation=" + fromLocation + ", tolocation=" + tolocation + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", duration=" + duration + ", totalSeats=" + totalSeats + "]";
	}
	
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getTolocation() {
		return tolocation;
	}
	public void setTolocation(String tolocation) {
		this.tolocation = tolocation;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	
	

}
