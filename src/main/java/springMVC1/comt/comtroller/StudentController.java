//package springMVC1.comt.comtroller;
//
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class StudentController{
//    @RequestMapping(value="/studentLogin")
//    public String userLogin(HttpServletRequest request, Model model) throws Exception {
//        request.setCharacterEncoding("UTF-8");		// 转码，防止中文出现乱码
//
//        String studentid = request.getParameter("studentid");	// 学号
//        String name = request.getParameter("name");		// 姓名
//        String sex = request.getParameter("sex");				// 性别
//        String age = request.getParameter("age");				// 年龄
//        String hometown = request.getParameter("hometown");		// 籍贯
//        String tel = request.getParameter("tel");				// 电话
//
//        model.addAttribute("studentid", studentid);
//        model.addAttribute("name", name);
//        model.addAttribute("sex", sex);
//        model.addAttribute("age", age);
//        model.addAttribute("hometown", hometown);
//        model.addAttribute("tel", tel);
//
//        return "studentinfo";
//    }
//}

//实验八
//package springMVC1.comt.comtroller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class StudentController {
//    @RequestMapping(value = "/studentadd")
//    public String studentAdd(int sno, String sname, int age, String where, String tw, float inumber, Model model) {
//        model.addAttribute("sno", sno);
//        model.addAttribute("sname", sname);
//        model.addAttribute("age", age);
//        model.addAttribute("where", where);
//        model.addAttribute("tw", tw);
//        model.addAttribute("inumber", inumber);
//
//        return "studentinfo";
//    }
//}

package springMVC1.comt.comtroller;

import springMVC1.com.po.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping(value = "/studentadd")
    public String studentAdd(Student student, Model model) {
        model.addAttribute("student", student);

        return "studentinfo";
    }
}
