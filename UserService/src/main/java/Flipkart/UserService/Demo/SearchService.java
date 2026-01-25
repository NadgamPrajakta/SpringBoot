package Flipkart.UserService.Demo;

import org.springframework.stereotype.Service;

@Service
public class SearchService {
	
    public void searchProduct(String product) {
        System.out.println("Searching Product: " + product);
    }
}
