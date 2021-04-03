package com.project.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.model.Flight;

public interface FlightRepository extends MongoRepository<Flight,String> {

	

}
