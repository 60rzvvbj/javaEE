package mybatis1.com.mapper;

import mybatis1.com.po.Course;

import java.util.List;

public interface CourseMapper {
    public Course selectCourseByCno(Integer cno);

    public List<Course> selectCourseByCname(String cname);

    public int insertCourse(Course course);

    public int deleteCourse(Integer cno);

    public int updateCourse(Course course);

    public List<Course> selectCourseByList(List<Course> list);

//    实验六
//    public int deleteCourseByCno(int cno);
}


//实验六
//public interface CourseMapper {
//    public Course selectCourseByCno(int cno);
//
//    public Course selectCourseByCname(String cname);
//
//    public void insertCourse(Course course);
//
//    public void deleteCourseByCno(int cno);
//
//    public void updateCourse(Course course);
//}
