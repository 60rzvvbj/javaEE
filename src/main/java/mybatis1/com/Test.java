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

import java.util.List;

public class Test {

    public static void main(String[] args) {

        SqlSession sqlSession = StudentDBUtil.getSession();
        int count = -1;

        // 生成Mapper的代理对象studentMapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        SCMapper scMapper = sqlSession.getMapper(SCMapper.class);
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

        System.out.println(studentMapper.selectStudentBySname("小"));
        System.out.println(courseMapper.selectCourseByCname("学"));
        System.out.println(scMapper.selectAll());
        System.out.println(teacherMapper.selectTeacherByTno(1));

        sqlSession.close();
    }
}
