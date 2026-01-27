package Grocery.App.Swiggy.Instamart.smartgrocery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instamart/delivery")
public class DeliveryController {

    private final DeliveryService service;

    public DeliveryController(DeliveryService service) {
        this.service = service;
    }

    @GetMapping("/status")
    public String status(
            @RequestParam(required = true, defaultValue = "On the Way") String status) {

        service.status(status);
        return "Delivery Status Checked";
    }
}
