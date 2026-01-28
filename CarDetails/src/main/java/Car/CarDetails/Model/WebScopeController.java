package Car.CarDetails.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebScopeController {

    @Autowired
    private RequestCarBean requestBean;

    @Autowired
    private SessionCarBean sessionBean;

    @Autowired
    private ApplicationCarBean appBean;

    @GetMapping("/webscope")
    public String scope() {
        return requestBean.scope() + " " +
               sessionBean.scope() + " " +
               appBean.scope();
    }
}
