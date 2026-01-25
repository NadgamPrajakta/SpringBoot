package OnlineShoppingApp.UserRegistration.Shopping;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public void registerUser(String name, String email) {
		
		System.out.println("User Registered Successfully");
		
		System.out.println("Name:" + name);
		
		System.out.println("Email:" + name);
	}

}
