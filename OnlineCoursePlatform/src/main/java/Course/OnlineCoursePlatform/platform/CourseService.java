package Course.OnlineCoursePlatform.platform;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CourseService {

    public String sessionInfo() {
    	
        return "User enrolled courses stored in session";
    }
}
