package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Ebook;
import entities.StationItinerary;
import entities.Traveler;
import services.interfaces.ReadingManagementLocal;
import services.interfaces.ReadingManagementRemote;

/**
 * Session Bean implementation class ReadingManagement
 */
@Stateless
public class ReadingManagement implements ReadingManagementRemote, ReadingManagementLocal {

	@PersistenceContext
	private EntityManager entityManager;
	
    public ReadingManagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addEbook(Ebook ebook) {
		Boolean b = false;
		try {
			entityManager.merge(ebook);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<Ebook> suggestEbooks(StationItinerary stationItinerary,
			Traveler traveler) {
		try {
			//Traveler travelerFound=entityManager.find(Traveler.class, traveler.getUserId());
			//StationItinerary stationItineraryFound=entityManager.find(StationItinerary.class, stationItinerary.getStationItineraryId());
			//Double duration=stationItineraryFound.getDuration();//supposant que c'est en minute
			//entityManager.merge(travelerFound);
			//entityManager.merge(stationItineraryFound);
			Integer MaxNbOfWords = 22 ; //MaxNbOfWords = duration/ReaderSpeed
			String jpql = "select m from Ebook m where m.nbOfWords BETWEEN 10 AND 40";
			Query query = entityManager.createQuery(jpql);
			//query.setParameter("param", MaxNbOfWords);
			return query.getResultList();
			
		} catch (Exception e) {
			return null;
		}
		
		
		
	}

}
