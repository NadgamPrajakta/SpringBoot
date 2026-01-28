package Order.Order.Processing.Orders;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class OrderService {

    public String status() {
    	
        return "New Order Request Created";
    }
}
