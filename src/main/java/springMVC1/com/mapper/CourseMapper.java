package springMVC1.com.mapper;

import springMVC1.com.po.Course;

import java.util.List;

public interface CourseMapper {
    Course selectCourseByCno(int cno);

    List<Course> selectCourseByCname(String cname);

    List<Course> selectCourses();

    void insertCourse(Course course);

    void updateCourse(Course course);

    void deleteCourseByCno(int cno);

}