package OnlineShoppingApp.UserRegistration.Shopping;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void makePayment(double amount, String mode) {
    	
        System.out.println("Payment Successful");
        System.out.println("Amount: " + amount);
        System.out.println("Mode: " + mode);
    }
}
