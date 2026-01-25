package Zomato.FoodDeliveryApp.Module;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void makePayment(double amount, String mode) {
    	
        System.out.println("Payment Successful");
        System.out.println("Amount: " + amount);
        System.out.println("Payment Mode: " + mode);
    }
}
