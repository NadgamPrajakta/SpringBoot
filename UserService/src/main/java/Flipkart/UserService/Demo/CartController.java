package Flipkart.UserService.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping("/addToCart")
    public String addToCart() {
        service.addToCart("Headphones");
        return "Item Added to Cart";
    }
}
