package US.UserLoginSystem.Userss;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class UserService {

    public String sessionStatus() {
        return "User session active";
    }
}
