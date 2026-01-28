package Cart.OnlineShoppingCart.shoppingcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    private CartService service;

    @GetMapping("/cart")
    public String cartInfo() {
        return service.cartStatus();
    }

    @PostMapping("/cart/add")
    public String addItem(@RequestBody CartItem item) {
        return item.getItemName() + " added to cart";
    }
}
