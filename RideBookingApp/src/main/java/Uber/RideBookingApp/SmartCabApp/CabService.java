package Uber.RideBookingApp.SmartCabApp;

import org.springframework.stereotype.Service;

@Service
public class CabService {

    public void searchCab(String cabType) {
    	
        System.out.println("Searching Cab");
        System.out.println("Cab Type: " + cabType);
    }
}
