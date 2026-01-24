package com.Amazon.OrderService.Model;

import com.Amazon.OrderService.Model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void placeOrder() {

        Order order = new Order();
        order.setOrderId(101);
        order.setProductName("Laptop");
        order.setQuantity(1);
        order.setPrice(55000);

        System.out.println("Order Details:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Product: " + order.getProductName());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Price: " + order.getPrice());
    }
}
