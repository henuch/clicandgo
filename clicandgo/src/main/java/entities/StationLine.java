package entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: StationLine
 *
 */
@Entity
public class StationLine implements Serializable {

	private StationLineId StationLineId;
	private Integer order;
	private Double duration;
	private static final long serialVersionUID = 1L;

	private Station station;
	private Line line;

	public StationLine() {
		super();
	}

	public StationLine(entities.StationLineId stationLineId, Integer order,
			Double duration, Station station, Line line) {
		super();
		this.StationLineId = new StationLineId(line.getLineID(),
				station.getStationId());
		this.order = order;
		this.duration = duration;
		this.station = station;
		this.line = line;
	}

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Double getDuration() {
		return this.duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	@EmbeddedId
	public StationLineId getStationLineId() {
		return StationLineId;
	}

	public void setStationLineId(StationLineId stationLineId) {
		StationLineId = stationLineId;
	}

	@ManyToOne
	@JoinColumn(name = "stationId", referencedColumnName = "stationId", insertable = false, updatable = false)
	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	@ManyToOne
	@JoinColumn(name = "lineId", referencedColumnName = "lineId", insertable = false, updatable = false)
	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

}
