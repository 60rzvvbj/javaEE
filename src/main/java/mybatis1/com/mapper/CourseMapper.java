package mybatis1.com.mapper;

import mybatis1.com.po.Course;

import java.util.List;

public interface CourseMapper {
    public Course selectCourseByCno(Integer cno);
    public List<Course> selectCourseByCname(String cname);
    public int insertCourse(Course course);
    public int deleteCourse(Integer cno);
    public int updateCourse(Course course);
}
