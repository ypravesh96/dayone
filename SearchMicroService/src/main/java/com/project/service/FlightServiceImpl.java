package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Exception.RecordAlreadyPresentException;
import com.project.Exception.RecordNotFoundException;
import com.project.model.Flight;
import com.project.repo.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightRepository flightRepo;

//	-----------------------------------ADDING FLIGHS------------------------------------------
	
	public String addFlight(Flight flight) {
		Optional<Flight> findById = flightRepo.findById(flight.getFlightNumber());
		
			if (!findById.isPresent()) {
				flightRepo.save(flight);
				return "Flight Added";
				
			} else {
				
				throw new RecordAlreadyPresentException("Flight with number: " + flight.getFlightNumber() + " already present");
		}
	}

//	-------------------------------- FIND ALL FLIGHT ---------------------------------------
	
	public List<Flight> findflights(){
		
		return flightRepo.findAll();
	}
     
//	-------------------------  GETTING FLIGHT BY ID  ------------------------------------------------ 
	
	@Override
	public Flight getFlight(String flightNumber) {
		
		return flightRepo.findById(flightNumber)
				.orElseThrow(()->new RecordNotFoundException("Flight not fount with id :"+flightNumber));

		
	}
	
//	--------------------------------  UPDATING FLIGHT ------------------------------------

	public Flight updateFlight(Flight flight) {
		Optional<Flight> findById = flightRepo.findById(flight.getFlightNumber());
		if (findById.isPresent()) {
			flightRepo.save(flight);
		}
		else {
			throw new RecordNotFoundException("Flight with number: " + flight.getFlightNumber() + " not exists");
		}
			return flight;
		
		}
	
//   ------------------------------- REMOVING FLIGHT BY ID -------------------------------	

	public String removeFlight(String flightNumber) {
		Optional<Flight> findById = flightRepo.findById(flightNumber);
		if (findById.isPresent()) {
			flightRepo.deleteById(flightNumber);
			return "Flight removed";
		} 
		else {
			throw new RecordNotFoundException("Flight with number: " + flightNumber + " not exists");

		}
	}

	
}
