package OnlineShoppingApp.UserRegistration.Shopping;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public void searchProduct(String productName) {
    	
        System.out.println("Searching Product");
        System.out.println("Product Name: " + productName);
    }
}
