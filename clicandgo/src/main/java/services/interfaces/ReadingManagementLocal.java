package services.interfaces;

import java.util.List;

import javax.ejb.Local;

import entities.Ebook;
import entities.StationItinerary;
import entities.Traveler;

@Local
public interface ReadingManagementLocal {

	Boolean addEbook(Ebook ebook);
	List<Ebook> suggestEbooks(StationItinerary stationItinerary, Traveler traveler );

}
