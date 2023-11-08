package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.practice.entity.AirLines;
import com.practice.repository.AirLineRepository;

@Service
public class AirLineService {

	@Autowired
	private AirLineRepository airLineRepository;

	public void registerFlight(AirLines flight) {

		airLineRepository.save(flight);
	}

	public ResponseEntity<List<AirLines>> allFlights() {

		List<AirLines> findAll = airLineRepository.findAll();
		return new ResponseEntity<>(findAll, HttpStatus.FOUND);
	}

	public void update_Details_flight(AirLines airLines) {
		airLineRepository.save(airLines);
	}

	public void cancled_Flight(String flightName) {
		airLineRepository.deleteById(flightName);
	}
}