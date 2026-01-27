package Grocery.App.Swiggy.Instamart.smartgrocery;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instamart/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public String register(
            @RequestParam(required = true, defaultValue = "Guest") String name,
            @RequestParam(required = true, defaultValue = "Mumbai") String city) {

        service.register(name, city);
        return "User Registered Successfully";
    }
}

