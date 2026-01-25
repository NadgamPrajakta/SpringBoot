package Flipkart.UserService.Demo;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void makePayment(double amount) {
        System.out.println("Payment Successful");
        System.out.println("Amount Paid: ₹" + amount);
    }
}
