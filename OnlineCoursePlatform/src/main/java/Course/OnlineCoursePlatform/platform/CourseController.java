package Course.OnlineCoursePlatform.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("/course/session")
    public String sessionStatus() {
        return service.sessionInfo();
    }

    @PostMapping("/course/enroll")
    public String enroll(@RequestBody Course course) {
        return "Enrolled in " + course.getCourseName();
    }
}
