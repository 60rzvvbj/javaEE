package spring4.com.dao;

import spring4.com.po.Teacher;

import java.util.List;

public interface TeacherDao {
    List<Teacher> selectAllTeacher();
}
