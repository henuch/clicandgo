package BusinessDelegator;

import java.util.List;

import entities.Ebook;
import entities.StationItinerary;
import entities.Traveler;
import ServiceLocator.ServiceLocator;
import services.interfaces.ReadingManagementRemote;

public class ReadingManagementDelegate {

	public static final String jndiName = "/clicandgo-ejb/ReadingManagement!services.interfaces.ReadingManagementRemote";

	public static ReadingManagementRemote getProxy() {
		return (ReadingManagementRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static Boolean doAddEbook(Ebook ebook){
		return getProxy().addEbook(ebook);
	}
	
	public static List<Ebook> suggestEbooks(StationItinerary stationItinerary, Traveler traveler ){
		return getProxy().suggestEbooks(stationItinerary, traveler);
	}
}
