package Flipkart.UserService.Demo;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
    public void login(String username) {
        System.out.println("User Logged In: " + username);
    }
}
