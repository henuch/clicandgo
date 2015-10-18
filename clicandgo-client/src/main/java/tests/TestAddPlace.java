package tests;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Place;
import services.interfaces.PlaceServicesRemote;
public class TestAddPlace {
	static Context context;
	static PlaceServicesRemote proxy;

	public static void main(String[] args) throws NamingException {
		context = new InitialContext();
		proxy = (PlaceServicesRemote) context
				.lookup("/clicandgo-ejb/PlaceServices!services.interfaces.PlaceServicesRemote");

		testAddPlace();
		
	}

	public static void testAddPlace() {
		Place place = new Place();
		place.setPlaceId(1);
		place.setName("ppp");
		place.setDescription("affef");
		place.setCategory("eee");
		place.setStation(null);
		proxy.addPlace(place);
		
	}

	
}
