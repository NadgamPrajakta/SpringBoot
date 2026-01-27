package Grocery.App.Swiggy.Instamart.smartgrocery;

import org.springframework.stereotype.Service;

@Service
public class GroceryService {

    public void searchItem(String item) {
    	
        System.out.println("Searching Grocery Item");
        System.out.println("Item: " + item);
    }
}
