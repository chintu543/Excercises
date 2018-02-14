package org.airline.rest.controller;

import java.util.Optional;

import org.AirlineRepositories.Flight;
import org.AirlineRepositories.service.FlightService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class AirlineRestController {

	private FlightService flightService;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ResponseEntity<?> getFlights() {
		return new ResponseEntity(flightService.getAllFlights(), HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addFlight(@RequestBody Flight f) {
		boolean flag = flightService.addflight(f);
		if (flag)
			return new ResponseEntity(HttpStatus.CREATED);
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/{FlightById}", method = RequestMethod.GET, consumes = { "application/json" }, produces = {
			"application/json" })
	public Optional<Flight> getFlightById(@PathVariable("FlightById") String fid) {
		return flightService.getFlightById(Integer.parseInt(fid));
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> updateFlight(@RequestBody Flight f) {
		flightService.updateFlight(f);
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/{FlightById}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteFlight(@PathVariable("FlightById") String fid) {
		flightService.deleteFlight(Integer.parseInt(fid));
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}

}
