package Order.Order.Processing.Orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping("/order")
    public String orderInfo() {
    	
        return service.status();
    }

    @PostMapping("/order")
    public String placeOrder(@RequestBody Order order) {
    	
        return "Order placed for " + order.getProduct();
    }
}
