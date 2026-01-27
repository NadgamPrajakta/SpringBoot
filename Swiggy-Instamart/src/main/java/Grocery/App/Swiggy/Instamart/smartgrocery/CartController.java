package Grocery.App.Swiggy.Instamart.smartgrocery;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instamart/cart")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @PostMapping("/add/{qty}")
    public String add(
            @RequestParam(required = true, defaultValue = "Rice") String item,
            @PathVariable int qty) {

        service.addItem(item, qty);
        return "Added to Cart";
    }
}
