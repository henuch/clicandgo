package testsStation;

import BusinessDelegator.StationDelegate;
import entities.Station;

public class TestDeleteStation {

	public static void main(String[] args) {
		Station station = new Station();
		station = StationDelegate.doFindStationById(1);
		System.out.print(StationDelegate.doDeleteStation(station));
	}

}
