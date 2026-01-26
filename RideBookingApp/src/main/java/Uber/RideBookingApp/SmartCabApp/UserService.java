package Uber.RideBookingApp.SmartCabApp;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public void registerUser(String name, String mobile) {
		
		System.out.println("User Registered Succesfully");
		
		System.out.println("Name:" + name);
		
		System.out.println("Mobile:" + mobile);
		
	}

}
