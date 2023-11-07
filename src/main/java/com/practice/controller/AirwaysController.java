package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.AirLines;
import com.practice.service.AirLineService;

@RestController
public class AirwaysController {

	@Autowired
	private AirLineService airLineService;

	@GetMapping("/drugLord")
	public String sayMyName() {
		return "Pablo Emilo Escobar Gravetio";
	}

	@PostMapping("/registerFlight")
	public String registerFlight(@RequestBody AirLines flight) {

		airLineService.registerFlight(flight);
		return "Registered...!";
	}
	
	
	@GetMapping("/allFlights")
	public List<AirLines>  allFlights()
	{
		return airLineService.allFlights();
		
	}

}
