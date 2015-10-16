package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Line
 *
 */
@Entity
public class Line implements Serializable {

	private Integer lineID;
	private String name;
	private Integer nbStations;
	private static final long serialVersionUID = 1L;

	private List<MeanOfTransport> meansOftransport;
	private List<Station> stations;

	public Line() {
		super();
	}

	@Id
	public Integer getLineID() {
		return this.lineID;
	}

	public void setLineID(Integer lineID) {
		this.lineID = lineID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNbStations() {
		return this.nbStations;
	}

	public void setNbStations(Integer nbStations) {
		this.nbStations = nbStations;
	}

	@OneToMany
	public List<MeanOfTransport> getMeansOftransport() {
		return meansOftransport;
	}

	public void setMeansOftransport(List<MeanOfTransport> meansOftransport) {
		this.meansOftransport = meansOftransport;
	}

	@ManyToMany
	public List<Station> getStations() {
		return stations;
	}

	public void setStations(List<Station> stations) {
		this.stations = stations;
	}

}
