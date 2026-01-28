package Car.CarDetails.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestCarBean {
	
    public String scope() {
    	
        return "Request Scope Car";
    }
}
