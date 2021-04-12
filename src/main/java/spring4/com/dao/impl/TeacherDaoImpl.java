package spring4.com.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import spring4.com.dao.TeacherDao;
import spring4.com.po.Teacher;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class TeacherDaoImpl implements TeacherDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Teacher> selectAllTeacher() {
        String sql = "select * from teacher";
        final List<Teacher> list = new LinkedList<>();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                Teacher teacher = new Teacher();
                teacher.setTno(resultSet.getInt("tno"));
                teacher.setTn(resultSet.getString("tn"));
                teacher.setTsex(resultSet.getString("tsex"));
                teacher.setTrank(resultSet.getString("trank"));
                teacher.setTdel(resultSet.getString("tdel"));
                list.add(teacher);
            }
        });
        return list;
    }
}
