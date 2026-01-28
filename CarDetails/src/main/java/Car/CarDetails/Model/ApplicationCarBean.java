package Car.CarDetails.Model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class ApplicationCarBean {
	
    public String scope() {
    	
        return "Application Scope Car";
    }
}
