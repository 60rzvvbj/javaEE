package springMVC1.sy8.controller;

import springMVC1.com.po.TeacherCourse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {
    @RequestMapping("/teacourses")
    public String chooseCourse(TeacherCourse teacherCourse, Model model) {
        model.addAttribute("teachercourse", teacherCourse);
        return "teachercourseinfo";
    }
}
