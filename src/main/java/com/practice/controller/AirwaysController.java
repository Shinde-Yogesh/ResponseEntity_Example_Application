package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.AirLines;
import com.practice.service.AirLineService;

@RestController
public class AirwaysController {

	@Autowired
	private AirLineService airLineService;

	// General method for checking the configuration 
	@GetMapping("/sayMyName/{String Name}")
	public String sayMyName(@PathVariable String Name) {
		return "Say My Name : " +Name;
	}

	//for register the new flight
	@PostMapping("/registerFlight")
	public String registerFlight(@RequestBody AirLines flight) {

		airLineService.registerFlight(flight);
		return "Registered...!";
	}
	
	//checking the credentials 
	@PutMapping("/updateDetails")
	public void update_Details_flight(@RequestBody AirLines airLines)
	{
		airLineService.update_Details_flight(airLines);
	}
	
	
	//Day's flight
	@GetMapping("/allFlights")
	public List<AirLines>  allFlights()
	{
		return airLineService.allFlights();
		
	}
	
	

}
