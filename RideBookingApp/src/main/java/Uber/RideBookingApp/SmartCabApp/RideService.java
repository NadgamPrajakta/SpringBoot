package Uber.RideBookingApp.SmartCabApp;

import org.springframework.stereotype.Service;

@Service
public class RideService {

    public void bookRide(String cabType, double fare) {
    	
        System.out.println("Ride Booked Successfully");
        System.out.println("Cab Type: " + cabType);
        System.out.println("Estimated Fare: " + fare);
    }
}
