package springMVC1.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springMVC1.com.mapper.CourseMapper;
import springMVC1.com.po.Course;
import springMVC1.com.service.CourseService;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findAllCourse() {
        return courseMapper.selectCourses();
    }

    @Override
    public Course findCourseByCno(int cno) {
        return courseMapper.selectCourseByCno(cno);
    }

    @Override
    public void addCourse(Course course) {
        courseMapper.insertCourse(course);
    }

    @Override
    public void deleteCourse(int[] cnoArray) {
        for (int i = 0; i < cnoArray.length; i++) {
            courseMapper.deleteCourseByCno(cnoArray[i]);
        }
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }
}
