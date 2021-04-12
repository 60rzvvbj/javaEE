package spring4.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring4.com.dao.CourseDao;
import spring4.com.dao.SCDao;
import spring4.com.dao.StudentDao;
import spring4.com.dao.TeacherDao;
import spring4.com.po.Student;
import spring4.com.service.StudentService;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        CourseDao courseDao = (CourseDao)app.getBean("courseDao");
        TeacherDao teacherDao = (TeacherDao) app.getBean("teacherDao");
        SCDao scDao = (SCDao)app.getBean("SCDao");
        System.out.println(courseDao.selectAllCourse());
        System.out.println(teacherDao.selectAllTeacher());
        System.out.println(scDao.selectAllSC());
    }
}
