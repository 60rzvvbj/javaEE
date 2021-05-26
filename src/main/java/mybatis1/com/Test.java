package mybatis1.com;

import mybatis1.com.dao.impl.StudentDaoImpl;
import mybatis1.com.mapper.CourseMapper;
import mybatis1.com.mapper.SCMapper;
import mybatis1.com.mapper.StudentMapper;
import mybatis1.com.mapper.TeacherMapper;
import mybatis1.com.po.Course;
import mybatis1.com.po.Student;
import mybatis1.com.po.Teacher;
import mybatis1.com.utils.StudentDBUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeacherMapper teacherMapper = applicationContext.getBean(TeacherMapper.class);
        Teacher teacher = teacherMapper.selectTeacherByTno(1);
        System.out.println(teacher);

        List<Teacher> teacher2=teacherMapper.selectTeacherByTname("周云霞");
        System.out.println(teacher2);

        Teacher teacher3=new Teacher();
        teacher3.setTname("郑洁");
        teacher3.setTno(4);
        teacher3.setTsex("女");
        teacher3.setTel("13800138000");
        teacherMapper.insertTeacher(teacher3);

        teacherMapper.deleteTeacherByTno(1);

        Teacher teacher4=new Teacher();
        teacher4.setTel("13118808880");
        teacher4.setTname("周云霞");
        teacher4.setTno(3);
        teacher4.setTsex("女");
        teacherMapper.updateTeacher(teacher4);

    }
}
