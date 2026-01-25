package Zomato.FoodDeliveryApp.Module;

import org.springframework.stereotype.Service;

@Service
public class CartService {

    public void addFood(String foodItem, int quantity) {
    	
        System.out.println("Food Added to Cart");
        System.out.println("Item: " + foodItem);
        System.out.println("Quantity: " + quantity);
    }
}
