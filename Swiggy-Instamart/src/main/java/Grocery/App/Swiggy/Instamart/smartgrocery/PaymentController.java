package Grocery.App.Swiggy.Instamart.smartgrocery;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instamart/payment")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping("/pay")
    public String pay(
            @RequestParam(required = true, defaultValue = "500") double amount,
            @RequestParam(required = true, defaultValue = "UPI") String mode) {

        service.pay(amount, mode);
        return "Payment Completed";
    }
}
