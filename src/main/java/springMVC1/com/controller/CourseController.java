package springMVC1.com.controller;


import springMVC1.com.po.Course;
import springMVC1.com.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/courselist")
    public String courseList(Model model) {
        List<Course> list = courseService.findAllCourse();
        model.addAttribute("courseList", list);
        return "course/courselist";
    }

    @RequestMapping(value = "/coursepreinsert", method = RequestMethod.GET)
    public String coursePreinsert() {
        return "course/courseadd";
    }

    @RequestMapping(value = "/courseinsert", method = RequestMethod.POST)
    public String courseInsert(Course course) {
        courseService.addCourse(course);
        return "redirect:courselist";
    }

    @RequestMapping(value = "/coursedelete", method = RequestMethod.POST)
    public String courseDelete(int[] cnoArray) {
        courseService.deleteCourse(cnoArray);
        return "redirect:courselist";
    }

    @RequestMapping(value = "/coursepreupdate", method = RequestMethod.GET)
    public String coursePreupdate(Course course, Model model) {
        model.addAttribute("course", course);
        return "course/courseupdate";

    }

    @RequestMapping(value = "/courseupdate", method = RequestMethod.POST)
    public String courseUpdate(Course course) {
        courseService.updateCourse(course);
        return "redirect:courselist";
    }
}
