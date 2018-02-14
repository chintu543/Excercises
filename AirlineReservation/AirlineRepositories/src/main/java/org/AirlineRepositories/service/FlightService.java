package org.AirlineRepositories.service;

import java.util.List;
import java.util.Optional;

import org.AirlineRepositories.Flight;
import org.AirlineRepositories.FlightDAO;
import org.AirlineRepositories.FlightDetailsDAO;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;

public class FlightService {

	@Autowired
	private FlightDAO flightdao;

	@Autowired
	private FlightDetailsDAO fdetailsdao;

	public boolean addflight(Flight f) {
		if (flightdao.existsById(f.getFlightId())) {
			return false;
		} else {
			flightdao.save(f);
			return true;
		}
	}

	public Optional<Flight> getFlightById(int flightId) {
		Optional<Flight> f = flightdao.findById(flightId);
		return f;
	}

	public List<Flight> getAllFlights() {
		return Lists.newArrayList(flightdao.findAll());
	}

	public void updateFlight(Flight f) {
		flightdao.save(f);
	}

	public void deleteFlight(int flightId) {
		flightdao.deleteById(flightId);
	}
}
