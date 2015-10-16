package entities;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ticket
 *
 */
@Entity

public class Ticket implements Serializable {

	
	private Integer ticketId;
	private State state;
	private Double price;
	private static final long serialVersionUID = 1L;
	
	private User user;

	public Ticket() {
		super();
	}   
	@Id    
	public Integer getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}   
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}   
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	@ManyToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
   
}
