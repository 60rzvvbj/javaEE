// 实验六
package mybatis1.com.dao.impl;

import mybatis1.com.dao.StudentDao;
import mybatis1.com.po.Student;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao {
    public Student selectStudentBySno(String sno) {
        return this.getSqlSession().selectOne("com.mapper.StudentMapper.selectStudentBySno", "100000001");
    }

    public List<Student> selectStudentBySname(String sname) {
        return this.getSqlSession().selectList("com.mapper.StudentMapper.selectStudentBySname", sname);
    }

    public int deleteStudent(String sno) {
        return this.getSqlSession().delete("com.mapper.StudentMapper.deleteStudent", sno);
    }

    public int updateStudent(Student student) {
        return this.getSqlSession().update("com.mapper.StudentMapper.updateStudent", student);
    }

    public int insertStudent(Student student) {
        return this.getSqlSession().insert("com.mapper.StudentMapper.insertStudent", student);
    }

}
