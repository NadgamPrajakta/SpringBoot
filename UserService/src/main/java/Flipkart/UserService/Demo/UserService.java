package Flipkart.UserService.Demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void register(User user) {
        System.out.println("User Registered");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }
}
