package OnlineShoppingApp.UserRegistration.Shopping;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void placeOrder(String product, double price) {
    	
        System.out.println("Order Placed Successfully");
        
        System.out.println("Product: " + product);
        System.out.println("Price: " + price);
    }
}
