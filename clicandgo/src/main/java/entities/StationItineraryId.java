package entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StationItineraryId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idItinerary;
	private Integer idStation;

	public StationItineraryId() {

	}

	public StationItineraryId(Integer idItinerary, Integer idStation) {
		super();
		this.idItinerary = idItinerary;
		this.idStation = idStation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idItinerary == null) ? 0 : idItinerary.hashCode());
		result = prime * result
				+ ((idStation == null) ? 0 : idStation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StationItineraryId other = (StationItineraryId) obj;
		if (idItinerary == null) {
			if (other.idItinerary != null)
				return false;
		} else if (!idItinerary.equals(other.idItinerary))
			return false;
		if (idStation == null) {
			if (other.idStation != null)
				return false;
		} else if (!idStation.equals(other.idStation))
			return false;
		return true;
	}

	public Integer getItineraryId() {
		return idItinerary;
	}

	public void setItineraryId(Integer idItinerary) {
		this.idItinerary = idItinerary;
	}

	public Integer getStationId() {
		return idStation;
	}

	public void setStationId(Integer idStation) {
		this.idStation = idStation;
	}

	//
	// public StationItineraryId(Integer idItinerary, Integer idStation) {
	// super();
	// this.idItinerary = idItinerary;
	// this.idStation = idStation;
	// }
	//
	// @Override
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + ((idItinerary == null) ? 0 :
	// idItinerary.hashCode());
	// result = prime * result
	// + ((idStation == null) ? 0 : idStation.hashCode());
	// return result;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// StationItineraryId other = (StationItineraryId) obj;
	// if (idItinerary == null) {
	// if (other.idItinerary != null)
	// return false;
	// } else if (!idItinerary.equals(other.idItinerary))
	// return false;
	// if (idStation == null) {
	// if (other.idStation != null)
	// return false;
	// } else if (!idStation.equals(other.idStation))
	// return false;
	// return true;
	// }
	//
	// public Integer getItineraryId() {
	// return idItinerary;
	// }
	//
	// public void setItineraryId(Integer idItinerary) {
	// this.idItinerary = idItinerary;
	// }
	//
	// public Integer getStationId() {
	// return idStation;
	// }
	//
	// public void setStationId(Integer idStation) {
	// this.idStation = idStation;
	// }

}
