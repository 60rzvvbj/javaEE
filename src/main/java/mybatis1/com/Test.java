package mybatis1.com;

import mybatis1.com.mapper.CourseMapper;
import mybatis1.com.mapper.SCMapper;
import mybatis1.com.mapper.StudentMapper;
import mybatis1.com.mapper.TeacherMapper;
import mybatis1.com.po.Course;
import mybatis1.com.po.Student;
import mybatis1.com.po.Teacher;
import mybatis1.com.utils.StudentDBUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        SqlSession sqlSession = StudentDBUtil.getSession();

        Student student = sqlSession.selectOne("mybatis1.com.mapper.StudentMapper.selectStudentCoursesBySno", "100000001");
        System.out.println(student);

        sqlSession.close();
    }
}
