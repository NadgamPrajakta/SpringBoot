package Car.CarDetails.Model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionCarBean {
	
    public String scope() {
    	
        return "Session Scope Car";
    }
}
