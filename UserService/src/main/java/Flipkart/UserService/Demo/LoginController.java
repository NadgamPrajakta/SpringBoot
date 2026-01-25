package Flipkart.UserService.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @GetMapping("/login")
    public String login() {
        service.login("prajkta");
        return "Login Successful";
    }
}
