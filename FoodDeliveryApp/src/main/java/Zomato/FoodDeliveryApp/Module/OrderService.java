package Zomato.FoodDeliveryApp.Module;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void placeOrder(String foodItem, double price) {
    	
        System.out.println("Order Placed");
        System.out.println("Food Item: " + foodItem);
        System.out.println("Price: " + price);
    }
}
