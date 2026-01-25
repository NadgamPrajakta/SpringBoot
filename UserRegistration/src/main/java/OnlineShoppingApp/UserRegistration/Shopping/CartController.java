package OnlineShoppingApp.UserRegistration.Shopping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	private final CartService service;
	
	public CartController(CartService service) {
		
		this.service=service;
	}
	
	@PostMapping("/add")
    public String add(
            @RequestParam(required = true, defaultValue = "Laptop") String product,
            @RequestParam(required = true, defaultValue = "1") int quantity) {

        service.addToCart(product, quantity);
        return "Item Added to Cart";
    }
}