package Uber.RideBookingApp.SmartCabApp;

import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	public void selectLocation(String pickup, String drop) {
		
		System.out.println("Location Selected");
		
		System.out.println("Pickup:" + pickup);
		
		System.out.println("Drop:" + drop);
	}

}
