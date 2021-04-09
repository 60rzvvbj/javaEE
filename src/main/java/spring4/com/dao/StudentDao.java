package spring4.com.dao;

import spring4.com.po.Student;

import java.util.List;

public interface StudentDao {
    Student selectStudentBySno(int sno);

    List<Student> selectStudentBySn(String sn);

    int updateStudent(Student student);

    int deleteStudentBySno(int sno);

    int deleteStudentBySn(String sn);

    int insertStudent(Student student);
}
