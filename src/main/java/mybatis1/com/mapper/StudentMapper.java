package mybatis1.com.mapper;

import mybatis1.com.po.Student;

import java.util.List;

public interface StudentMapper {
    public Student selectStudentBySno(String sno);

    public List<Student> selectStudentBySname(String sname);

    public int insertStudent(Student stu);

    public int deleteStudent(String sno);

    public int updateStudent(Student stu);

    public List<Student> selectStudent(Student stu);

    public List<Student> selectStudentByList(List<Student> list);

//    实验六
//    public Student selectStudentByTno(int sno);
//
//    public Student selectStudentByTname(String sname);
//
//    public void insertStudent(Student student);
//
//    public void deleteStudentByTno(int sno);
//
//    public void updateStudent(Student student);
}
