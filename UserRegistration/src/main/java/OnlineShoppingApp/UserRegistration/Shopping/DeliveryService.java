package OnlineShoppingApp.UserRegistration.Shopping;

import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    public void checkDeliveryStatus(String status) {
    	
        System.out.println("Delivery Status");
        System.out.println("Status: " + status);
    }
}
