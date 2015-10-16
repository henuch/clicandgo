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
	
	private Line line;

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
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
   
}
