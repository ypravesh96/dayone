package com.project.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Flight;

import com.project.repo.FlightRepository;


@RestController
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepository;
	
	
	

	@PostMapping("/add")
	public String saveFlight(@RequestBody Flight flight) {
		flightRepository.save(flight);
		return "added Flight with number" + flight.getFlightNumber();
	}
	
	@GetMapping("/findFlights")
	public List<Flight> findflight(){
		return flightRepository.findAll();
	}
	
	
	
}
