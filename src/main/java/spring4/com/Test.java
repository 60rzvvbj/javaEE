package spring4.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring4.com.dao.StudentDao;
import spring4.com.po.Student;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = (StudentDao) app.getBean("studentDao");
        int res = studentDao.insertStudent(new Student(1003, "张三", "男", "广东广州", 10002));
//        int res = studentDao.deleteStudentBySno(1003);
//        System.out.println(studentDao.selectStudentBySno(1001));
        System.out.println(studentDao.selectStudentBySn("张三"));
//        System.out.println(res);
    }

}
