package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.Ebook;
import entities.StationItinerary;
import entities.Traveler;


@Remote
public interface ReadingManagementRemote {

	Boolean addEbook(Ebook ebook);
	
	List<Ebook> suggestEbooks(StationItinerary stationItinerary, Traveler traveler );
}
