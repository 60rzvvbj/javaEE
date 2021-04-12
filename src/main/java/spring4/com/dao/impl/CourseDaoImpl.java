package spring4.com.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import spring4.com.dao.CourseDao;
import spring4.com.po.Course;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class CourseDaoImpl implements CourseDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Course> selectAllCourse() {
        String sql = "select * from course";
        final List<Course> list = new LinkedList<>();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                Course course = new Course();
                course.setCno(resultSet.getInt("cno"));
                course.setCn(resultSet.getString("cn"));
                course.setChours(resultSet.getInt("chours"));
                list.add(course);
            }
        });
        return list;
    }
}
