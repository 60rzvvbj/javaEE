package spring4.com.dao;

import spring4.com.po.Course;

import java.util.List;

public interface CourseDao {
    List<Course> selectAllCourse();
}
