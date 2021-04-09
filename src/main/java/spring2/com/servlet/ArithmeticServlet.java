package spring2.com.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring2.com.ex01.testspring.Arithmetic;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "arithmetic", urlPatterns = {"/arithmetic"})
public class ArithmeticServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {
        double num1 = 0, num2 = 0;
        String str = request.getParameter("num1");
        if (str != null)
            num1 = Double.parseDouble(str);
        str = request.getParameter("num2");
        if (str != null)
            num2 = Double.parseDouble(str);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Arithmetic arithmetic;
        String type = request.getParameter("type");
        System.out.println(type);
        if (type.equals("add")) {
            arithmetic = (Arithmetic) applicationContext.getBean("arithmeticAdd");
        } else if (type.equals("sub")) {
            arithmetic = (Arithmetic) applicationContext.getBean("arithmeticSub");
        } else if (type.equals("mul")) {
            arithmetic = (Arithmetic) applicationContext.getBean("arithmeticMul");
        } else if (type.equals("div")) {
            arithmetic = (Arithmetic) applicationContext.getBean("arithmeticDiv");
        } else {
            arithmetic = null;
        }
        double result = arithmetic.calc(num1, num2);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}

