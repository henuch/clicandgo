package testReadingManagement;

import BusinessDelegator.ReadingManagementDelegate;
import entities.StationItinerary;
import entities.Traveler;

public class testSuggestEbook {

	public static void main(String[] args) {
		Traveler traveler = new Traveler();
		traveler.setName("Houcem");
		
		StationItinerary stationItinerary = new StationItinerary();
		stationItinerary.setDuration(33);
		
		System.out.println(ReadingManagementDelegate.suggestEbooks(stationItinerary, traveler));
	}
}
