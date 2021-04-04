package com.project.service;

import java.util.List;


import com.project.model.Flight;

public interface FlightService {

	String addFlight(Flight flight);

	List<Flight> findflights();

	

	Flight updateFlight(Flight flight);

	String removeFlight(String flightNumber);

	Flight getFlight(String flightNumber);

}
