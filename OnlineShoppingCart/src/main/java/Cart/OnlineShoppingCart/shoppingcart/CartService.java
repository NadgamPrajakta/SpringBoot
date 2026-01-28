package Cart.OnlineShoppingCart.shoppingcart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class CartService {

    public String cartStatus() {
    	
        return "New cart created for request";
    }
}
