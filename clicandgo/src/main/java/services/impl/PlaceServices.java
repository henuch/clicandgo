package services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Place;
import services.interfaces.PlaceServicesLocal;
import services.interfaces.PlaceServicesRemote;

/**
 * Session Bean implementation class PlaceServices
 */
@Stateless
public class PlaceServices implements PlaceServicesRemote, PlaceServicesLocal {

	
	@PersistenceContext
	private EntityManager entityManager;

    /**
     * Default constructor. 
     */
	
    public PlaceServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addPlace(Place place) {
		Boolean b = false;
		try {
			entityManager.merge(place);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deletePlaceByPlaceId(Integer placeId) {
		Boolean b = false;
		try {
			entityManager.remove(findPlaceByPlaceId(placeId));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updatePlace(Place place) {
		Boolean b = false;
		try {
			entityManager.merge(place);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Place findPlaceByPlaceId(Integer placeId) {
		return entityManager.find(Place.class, placeId);
	}

	@Override
	public Boolean deletePlace(Place place) {
		Boolean b = false;
		try {
			place = findPlaceByPlaceId(place.getPlaceId());
			entityManager.remove(place);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
