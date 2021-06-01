package springMVC1.coms.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController{
    @RequestMapping(value="/userLogin")
    public String userLogin(HttpServletRequest request, Model model) throws Exception {
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        model.addAttribute("username", username);
        model.addAttribute("pwd", pwd);

        return "result";
    }
}


