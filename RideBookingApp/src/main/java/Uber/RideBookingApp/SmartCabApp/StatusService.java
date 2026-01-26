package Uber.RideBookingApp.SmartCabApp;

import org.springframework.stereotype.Service;

@Service
public class StatusService {

    public void checkStatus(String status) {
    	
        System.out.println("Ride Status");
        System.out.println("Status: " + status);
    }
}
