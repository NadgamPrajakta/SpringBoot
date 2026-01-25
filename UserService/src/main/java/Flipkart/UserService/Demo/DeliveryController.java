package Flipkart.UserService.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    private final DeliveryService service;

    public DeliveryController(DeliveryService service) {
        this.service = service;
    }

    @GetMapping("/deliveryStatus")
    public String status() {
        service.checkDelivery();
        return "Delivery Status Checked";
    }
}

