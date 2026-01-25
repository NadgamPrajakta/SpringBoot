package Zomato.FoodDeliveryApp.Module;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService service;

    public RestaurantController(RestaurantService service) {
        this.service = service;
    }

    @GetMapping("/search")
    public String search(
            @RequestParam(required = true, defaultValue = "Dominos") String restaurantName) {

        service.searchRestaurant(restaurantName);
        return "Restaurant Search Completed";
    }
}
