package com.project.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Exception.RecordNotFoundException;
import com.project.model.Flight;

import com.project.repo.FlightRepository;
import com.project.service.FlightService;


@RestController
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	
	

	@PostMapping("/addFlight")
    public String addFlight(@RequestBody Flight flight) {
		flightService.addFlight(flight);
		return "added Flight with number" + flight.getFlightNumber();
	}
	
	@GetMapping("/findFlights")
	public List<Flight> findflights(){
		return flightService.findflights();
	}
	
	@GetMapping("/findFlights/{id}")
	public Flight  getFlight(@PathVariable("id") String flightNumber) {
		return flightService.getFlight(flightNumber);
	}
	
	@PutMapping("/updateFlight")
	public void updateFlight(@RequestBody Flight flight) {
		flightService.updateFlight(flight);
	}
	
	@DeleteMapping("/deleteFlight/{id}")
	public void  removeFlight(@PathVariable("id")  String flightNumber) {
		flightService.removeFlight(flightNumber);
		
	}
	
	
	
	
	
}
