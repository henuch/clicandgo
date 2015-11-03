package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: StationItinerary
 *
 */
@Entity
@Table(name = "station_itinerary")
public class StationItinerary implements Serializable {

	private StationItineraryId StationItineraryId;
	private Integer position;
	private Integer duration;
	private Integer distance;
	private static final long serialVersionUID = 1L;

	private Station station;
	private Itinerary itinerary;

	public StationItinerary() {
		super();
	}

	public StationItinerary(entities.StationItineraryId stationItineraryId,
			Integer position, Integer duration, Station station,
			Itinerary itinerary, Integer distance) {
		super();
		this.StationItineraryId = new StationItineraryId(
				itinerary.getItineraryId(), station.getStationId());
		this.position = position;
		this.setDuration(duration);
		this.station = station;
		this.itinerary = itinerary;
		this.distance=distance;
	}

	@EmbeddedId
	public StationItineraryId getStationItineraryId() {
		return StationItineraryId;
	}

	public void setStationItineraryId(StationItineraryId stationItineraryId) {
		StationItineraryId = stationItineraryId;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}



	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "stationId", referencedColumnName = "stationId",insertable = false, updatable = false)
	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "itineraryId", referencedColumnName = "itineraryId", insertable = false, updatable = false)
	public Itinerary getItinerary() {
		return itinerary;
	}

	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	
}
