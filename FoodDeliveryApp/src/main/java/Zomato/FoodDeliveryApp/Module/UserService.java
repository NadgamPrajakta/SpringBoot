package Zomato.FoodDeliveryApp.Module;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void registerUser(String name, String city) {
    	
        System.out.println("User Registered");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
    }
}
