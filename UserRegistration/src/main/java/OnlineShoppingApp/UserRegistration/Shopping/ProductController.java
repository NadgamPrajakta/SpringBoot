package OnlineShoppingApp.UserRegistration.Shopping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/search")
    public String search(
            @RequestParam(required = true, defaultValue = "Mobile") String productName) {

        service.searchProduct(productName);
        return "Product Search Done";
    }
}
