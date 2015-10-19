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
@Table(name="SI")
public class StationItinerary implements Serializable {

	private StationItineraryId StationItineraryId;
	private Integer order;
	private Double duration;
	private static final long serialVersionUID = 1L;

	
	private Station station;
	private Itinerary itinerary;
	
	public StationItinerary() {
		super();
	}
	
	



	public StationItinerary(entities.StationItineraryId stationItineraryId,
			Integer order, Double duration, Station station, Itinerary itinerary) {
		super();
		this.StationItineraryId = new StationItineraryId(itinerary.getItineraryId(), station.getStationId());
		this.order = order;
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

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}


	@ManyToOne(cascade = CascadeType.MERGE)
	//@JoinColumn(name = "idStation", referencedColumnName = "stationId", insertable = false, updatable = false)
	public Station getStation() {
		return station;
	}



	public void setStation(Station station) {
		this.station = station;
	}


	@ManyToOne(cascade = CascadeType.MERGE)
	//@JoinColumn(name = "idItinerary", referencedColumnName = "itineraryId", insertable = false, updatable = false)
	public Itinerary getItinerary() {
		return itinerary;
	}



	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}
	

	//
	// private Station station;
	// private Itinerary itinerary;
	//
	// public StationItinerary() {
	// super();
	// }
	//
	// public StationItinerary(entities.StationItineraryId stationItineraryId,
	// Integer order,
	// Double duration, Station station, Itinerary itinerary) {
	// super();
	// this.StationItineraryId = new
	// StationItineraryId(itinerary.getItineraryId(),
	// station.getStationId());
	// this.order = order;
	// this.duration = duration;
	// this.station = station;
	// this.itinerary = itinerary;
	// }
	//
	// public Integer getOrder() {
	// return this.order;
	// }
	//
	// public void setOrder(Integer order) {
	// this.order = order;
	// }
	//
	// public Double getDuration() {
	// return this.duration;
	// }
	//
	// public void setDuration(Double duration) {
	// this.duration = duration;
	// }
	//
	// @EmbeddedId
	// public StationItineraryId getStationItineraryId() {
	// return StationItineraryId;
	// }
	//
	// public void setStationItineraryId(StationItineraryId stationItineraryId)
	// {
	// StationItineraryId = stationItineraryId;
	// }
	//
	// @ManyToOne
	// @JoinColumn(name = "stationId", referencedColumnName = "stationId",
	// insertable = false, updatable = false)
	// public Station getStation() {
	// return station;
	// }
	//
	// public void setStation(Station station) {
	// this.station = station;
	// }
	//
	// @ManyToOne
	// @JoinColumn(name = "itineraryId", referencedColumnName = "itineraryId",
	// insertable = false, updatable = false)
	// public Itinerary getItinerary() {
	// return itinerary;
	// }
	//
	// public void setItinerary(Itinerary itinerary) {
	// this.itinerary = itinerary;
	// }
	//
}
