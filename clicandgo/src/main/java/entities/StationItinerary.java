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
@Table(name = "line")
public class StationItinerary implements Serializable {

	private StationItineraryId StationItineraryId;
	private Integer position;
	private Double duration;
	private static final long serialVersionUID = 1L;

	private Station station;
	private Itinerary itinerary;

	public StationItinerary() {
		super();
	}

	public StationItinerary(entities.StationItineraryId stationItineraryId,
			Integer position, Double duration, Station station,
			Itinerary itinerary) {
		super();
		this.StationItineraryId = new StationItineraryId(
				itinerary.getItineraryId(), station.getStationId());
		this.position = position;
		this.duration = duration;
		this.station = station;
		this.itinerary = itinerary;
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

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
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

	
}
