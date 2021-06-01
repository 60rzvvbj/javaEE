package springMVC1.comt.comtroller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController{
    @RequestMapping(value="/studentLogin")
    public String userLogin(HttpServletRequest request, Model model) throws Exception {
        request.setCharacterEncoding("UTF-8");		// 转码，防止中文出现乱码

        String studentid = request.getParameter("studentid");	// 学号
        String name = request.getParameter("name");		// 姓名
        String sex = request.getParameter("sex");				// 性别
        String age = request.getParameter("age");				// 年龄
        String hometown = request.getParameter("hometown");		// 籍贯
        String tel = request.getParameter("tel");				// 电话

        model.addAttribute("studentid", studentid);
        model.addAttribute("name", name);
        model.addAttribute("sex", sex);
        model.addAttribute("age", age);
        model.addAttribute("hometown", hometown);
        model.addAttribute("tel", tel);

        return "studentinfo";
    }
}
