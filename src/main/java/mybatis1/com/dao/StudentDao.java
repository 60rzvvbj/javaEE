package mybatis1.com.dao;

import mybatis1.com.po.Student;

//实验六
public interface StudentDao {
    public Student selectStudentBySno(String sno);
}
