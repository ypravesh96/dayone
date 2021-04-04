package com.project.model;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection ="Flights")
public class Flight {
	
	private String flightName;
	
	@Id
	private String flightNumber;
	private String source;
	private String destination;
	private Date dateOfDeparture;
	private Timestamp estimatedTime;
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(Timestamp estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	
	
	

}
