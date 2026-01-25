package Zomato.FoodDeliveryApp.Module;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping("/place")
    public String place(
            @RequestParam(required = true, defaultValue = "Burger") String foodItem,
            @RequestParam(required = true, defaultValue = "199") double price) {

        service.placeOrder(foodItem, price);
        return "Order Placed Successfully";
    }
}
