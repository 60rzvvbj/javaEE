package spring4.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring4.com.dao.StudentDao;
import spring4.com.po.Student;
import spring4.com.service.StudentService;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) app.getBean("studentService");
        studentService.exchangeMajor(1001, 1002);
    }
}
