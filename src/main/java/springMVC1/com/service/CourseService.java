package springMVC1.com.service;

import springMVC1.com.po.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAllCourse();

    Course findCourseByCno(int cno);

    void addCourse(Course course);

    void deleteCourse(int[] cnoArray);

    void updateCourse(Course course);
}
