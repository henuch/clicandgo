package entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StationItineraryId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer itineraryId;
	private Integer stationId;

	public StationItineraryId() {

	}

	public StationItineraryId(Integer itineraryId, Integer stationId) {
		super();
		this.itineraryId = itineraryId;
		this.stationId = stationId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itineraryId == null) ? 0 : itineraryId.hashCode());
		result = prime * result
				+ ((stationId == null) ? 0 : stationId.hashCode());
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
		if (itineraryId == null) {
			if (other.itineraryId != null)
				return false;
		} else if (!itineraryId.equals(other.itineraryId))
			return false;
		if (stationId == null) {
			if (other.stationId != null)
				return false;
		} else if (!stationId.equals(other.stationId))
			return false;
		return true;
	}

	public Integer getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(Integer itineraryId) {
		this.itineraryId = itineraryId;
	}

	public Integer getStationId() {
		return stationId;
	}

	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

}
