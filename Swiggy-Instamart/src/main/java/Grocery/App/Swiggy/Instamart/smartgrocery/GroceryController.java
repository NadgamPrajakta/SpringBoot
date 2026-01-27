package Grocery.App.Swiggy.Instamart.smartgrocery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instamart/grocery")
public class GroceryController {

    private GroceryService service;

    public GroceryController(GroceryService service) {
        this.service = service;
    }

    @GetMapping("/search")
    public String search(
            @RequestParam(required = true, defaultValue = "Milk") String item) {

        service.searchItem(item);
        return "Item Search Completed";
    }
}
