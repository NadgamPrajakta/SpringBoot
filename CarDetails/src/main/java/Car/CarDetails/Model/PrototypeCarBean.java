package Car.CarDetails.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeCarBean {

    public String getScopeType() {
    	
        return "Prototype Scope Car Bean";
    }
}
