package Grocery.App.Swiggy.Instamart.smartgrocery;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void place(Order order) {
    	
        System.out.println("Order Placed");
        System.out.println("Item: " + order.getItem());
        System.out.println("Price: " + order.getPrice());
    }
}
