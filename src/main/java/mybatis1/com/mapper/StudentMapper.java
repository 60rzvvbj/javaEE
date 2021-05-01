package mybatis1.com.mapper;

import mybatis1.com.po.Student;

import java.util.List;

public interface StudentMapper {
    public Student selectStudentBySno(String sno);

    public List<Student> selectStudentBySname(String sname);

    public int insertStudent(Student stu);

    public int deleteStudent(String sno);

    public int updateStudent(Student stu);
}
