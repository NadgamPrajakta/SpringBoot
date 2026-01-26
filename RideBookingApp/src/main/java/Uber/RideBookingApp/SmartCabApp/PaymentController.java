package Uber.RideBookingApp.SmartCabApp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping("/pay")
    public String pay(
            @RequestParam(required = true, defaultValue = "350") double amount,
            @RequestParam(required = true, defaultValue = "UPI") String method) {

        service.makePayment(amount, method);
        return "Payment Completed";
    }
}
