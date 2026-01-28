package Car.CarDetails.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonCarBean {

    public String getScopeType() {
        return "Singleton Scope Car Bean";
    }
}
