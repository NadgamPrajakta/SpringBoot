package Flipkart.UserService.Demo;

import org.springframework.stereotype.Service;

@Service
public class CartService {
	
    public void addToCart(String product) {
        System.out.println("Product Added to Cart");
        System.out.println("Product: " + product);
    }
}
