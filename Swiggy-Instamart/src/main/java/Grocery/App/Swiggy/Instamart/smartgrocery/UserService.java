package Grocery.App.Swiggy.Instamart.smartgrocery;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class UserService {

    public void register(String name, String city) {
        System.out.println("User Registered");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
    }
}
