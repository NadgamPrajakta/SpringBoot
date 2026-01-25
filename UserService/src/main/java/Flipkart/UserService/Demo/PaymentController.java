package Flipkart.UserService.Demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping("/payment")
    public String payment() {
        service.makePayment(49999);
        return "Payment Completed";
    }
}
