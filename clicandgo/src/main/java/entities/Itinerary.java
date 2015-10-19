package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Itinerary
 *
 */
@Entity
public class Itinerary implements Serializable {

	private Integer itineraryId;
	private String name;
	private Integer nbStations;
	private static final long serialVersionUID = 1L;
	
	private List<StationItinerary> stationItineraries;

	@Id
	public Integer getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(Integer itineraryId) {
		this.itineraryId = itineraryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNbStations() {
		return nbStations;
	}

	public void setNbStations(Integer nbStations) {
		this.nbStations = nbStations;
	}

	@OneToMany(mappedBy = "itinerary")
	public List<StationItinerary> getStationItineraries() {
		return stationItineraries;
	}

	public void setStationItineraries(List<StationItinerary> stationItineraries) {
		this.stationItineraries = stationItineraries;
	}

	// private List<MeanOfTransport> meansOftransport;
	// private List<StationItinerary> stationItineraries;
	// private List<Ticket> tickets;
	//
	// public Itinerary() {
	// super();
	// }
	//
	// @Id
	// public Integer getItineraryId() {
	// return this.itineraryId;
	// }
	//
	// public void setItineraryId(Integer itineraryId) {
	// this.itineraryId = itineraryId;
	// }
	//
	// public String getName() {
	// return this.name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public Integer getNbStations() {
	// return this.nbStations;
	// }
	//
	// public void setNbStations(Integer nbStations) {
	// this.nbStations = nbStations;
	// }
	//
	// @OneToMany(mappedBy = "itinerary")
	// public List<MeanOfTransport> getMeansOftransport() {
	// return meansOftransport;
	// }
	//
	// public void setMeansOftransport(List<MeanOfTransport> meansOftransport) {
	// this.meansOftransport = meansOftransport;
	// }
	//
	// @OneToMany(mappedBy = "itinerary")
	// public List<StationItinerary> getStationItineraries() {
	// return stationItineraries;
	// }
	//
	// public void setStationItineraries(List<StationItinerary>
	// stationItineraries) {
	// this.stationItineraries = stationItineraries;
	// }
	//
	// @OneToMany(mappedBy = "itinerary")
	// public List<Ticket> getTickets() {
	// return tickets;
	// }
	//
	// public void setTickets(List<Ticket> tickets) {
	// this.tickets = tickets;
	// }

}
