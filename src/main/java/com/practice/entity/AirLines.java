package com.practice.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AirLines {

	@Id
	private String flightName;
	
	private String AirLines_Name;
	
	
	private String flightPilot;
	private String flightCopilot;
	
	private String source;
	private String designation;

	private int pilotExperience;
	private int copilotExperience;

	private LocalDate flightDate;

	private LocalDate arriveDate;
	private LocalDate designationDate;

	private int Distance;
	
	//Airport servileness radar
	private boolean ASR;

	private int price;

	private boolean isAvailable;

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getAirLines_Name() {
		return AirLines_Name;
	}

	public void setAirLines_Name(String airLines_Name) {
		AirLines_Name = airLines_Name;
	}

	public String getFlightPilot() {
		return flightPilot;
	}

	public void setFlightPilot(String flightPilot) {
		this.flightPilot = flightPilot;
	}

	public String getFlightCopilot() {
		return flightCopilot;
	}

	public void setFlightCopilot(String flightCopilot) {
		this.flightCopilot = flightCopilot;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getPilotExperience() {
		return pilotExperience;
	}

	public void setPilotExperience(int pilotExperience) {
		this.pilotExperience = pilotExperience;
	}

	public int getCopilotExperience() {
		return copilotExperience;
	}

	public void setCopilotExperience(int copilotExperience) {
		this.copilotExperience = copilotExperience;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public LocalDate getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(LocalDate arriveDate) {
		this.arriveDate = arriveDate;
	}

	public LocalDate getDesignationDate() {
		return designationDate;
	}

	public void setDesignationDate(LocalDate designationDate) {
		this.designationDate = designationDate;
	}

	public int getDistance() {
		return Distance;
	}

	public void setDistance(int distance) {
		Distance = distance;
	}

	public boolean isASR() {
		return ASR;
	}

	public void setASR(boolean aSR) {
		ASR = aSR;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public AirLines(String flightName, String airLines_Name, String flightPilot, String flightCopilot, String source,
			String designation, int pilotExperience, int copilotExperience, LocalDate flightDate, LocalDate arriveDate,
			LocalDate designationDate, int distance, boolean aSR, int price, boolean isAvailable) {
		super();
		this.flightName = flightName;
		AirLines_Name = airLines_Name;
		this.flightPilot = flightPilot;
		this.flightCopilot = flightCopilot;
		this.source = source;
		this.designation = designation;
		this.pilotExperience = pilotExperience;
		this.copilotExperience = copilotExperience;
		this.flightDate = flightDate;
		this.arriveDate = arriveDate;
		this.designationDate = designationDate;
		Distance = distance;
		ASR = aSR;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	public AirLines() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AirLines [flightName=" + flightName + ", AirLines_Name=" + AirLines_Name + ", flightPilot="
				+ flightPilot + ", flightCopilot=" + flightCopilot + ", source=" + source + ", designation="
				+ designation + ", pilotExperience=" + pilotExperience + ", copilotExperience=" + copilotExperience
				+ ", flightDate=" + flightDate + ", arriveDate=" + arriveDate + ", designationDate=" + designationDate
				+ ", Distance=" + Distance + ", ASR=" + ASR + ", price=" + price + ", isAvailable=" + isAvailable + "]";
	}

	
	
	
	
}
