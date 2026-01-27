package Grocery.App.Swiggy.Instamart.smartgrocery;

import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    public void status(String status) {
    	
        System.out.println("Delivery Status");
        System.out.println("Status: " + status);
    }
}
