package Uber.RideBookingApp.SmartCabApp;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void makePayment(double amount, String method) {
    	
        System.out.println("Payment Successful");
        
        System.out.println("Amount: " + amount);
        System.out.println("Payment Method: " + method);
    }
}
