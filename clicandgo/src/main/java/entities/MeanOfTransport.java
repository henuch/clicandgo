package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MeanOfTransport
 *
 */
@Entity

public class MeanOfTransport implements Serializable {

	
	private String registrationNumber;
	private Integer nbOfWagons;
	private Integer capacity;
	private static final long serialVersionUID = 1L;
	
	private Itinerary itinerary;

	public MeanOfTransport() {
		super();
	}   
	@Id    
	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}   
	public Integer getNbOfWagons() {
		return this.nbOfWagons;
	}

	public void setNbOfWagons(Integer nbOfWagons) {
		this.nbOfWagons = nbOfWagons;
	}   
	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	@ManyToOne
	public Itinerary getItinerary() {
		return itinerary;
	}
	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}
	@Override
	public String toString() {
		return "MeanOfTransport [registrationNumber=" + registrationNumber
				+ ", nbOfWagons=" + nbOfWagons + ", capacity=" + capacity
				+ ", itinerary=" + itinerary + "]";
	}
	
	
	
   
}
