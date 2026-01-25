package OnlineShoppingApp.UserRegistration.Shopping;

import org.springframework.stereotype.Service;

@Service
public class CartService {
	
	public void addToCart(String product, int quantity) {
		
		System.out.println("Product Added to Cart");
		
		System.out.println("Product:" + product);
		
		System.out.println("Quantity:" + quantity);
	}

}
