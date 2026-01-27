package Grocery.App.Swiggy.Instamart.smartgrocery;

import org.springframework.stereotype.Service;

@Service
public class CartService {

    public void addItem(String item, int qty) {
    	
        System.out.println("Item Added to Cart");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
    }
}
