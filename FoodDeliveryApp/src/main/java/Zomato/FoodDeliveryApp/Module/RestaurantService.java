package Zomato.FoodDeliveryApp.Module;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    public void searchRestaurant(String restaurantName) {
    	
        System.out.println("Searching Restaurant");
        System.out.println("Restaurant: " + restaurantName);
    }
}
