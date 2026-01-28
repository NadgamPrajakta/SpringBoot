package Car.CarDetails.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeController {

    @Autowired
    private SingletonCarBean singletonBean;

    @Autowired
    private PrototypeCarBean prototypeBean;

    @GetMapping("/scope")
    public String checkScope() {
        return singletonBean.getScopeType() + " " 
        + prototypeBean.getScopeType();
    }
}
