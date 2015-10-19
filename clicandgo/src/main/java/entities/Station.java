package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Station
 *
 */
@Entity
public class Station implements Serializable {

	private Integer stationId;
	private String name;
	private static final long serialVersionUID = 1L;

	private List<StationItinerary> stationItineraries;

	@Id
	public Integer getStationId() {
		return stationId;
	}

	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "station")
	public List<StationItinerary> getStationItineraries() {
		return stationItineraries;
	}

	public void setStationItineraries(List<StationItinerary> stationItineraries) {
		this.stationItineraries = stationItineraries;
	}

	// private List<StationItinerary> stationItineraries;
	// private List<Place> places;
	//
	// public Station() {
	// super();
	// }
	//
	// @Id
	// public Integer getStationId() {
	// return this.stationId;
	// }
	//
	// public void setStationId(Integer stationId) {
	// this.stationId = stationId;
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
	// @OneToMany(mappedBy = "station")
	// public List<Place> getPlaces() {
	// return places;
	// }
	//
	// public void setPlaces(List<Place> places) {
	// this.places = places;
	// }
	//
	// @OneToMany(mappedBy = "station")
	// public List<StationItinerary> getStationItineraries() {
	// return stationItineraries;
	// }
	//
	// public void setStationItineraries(List<StationItinerary>
	// stationItineraries) {
	// this.stationItineraries = stationItineraries;
	// }

}
