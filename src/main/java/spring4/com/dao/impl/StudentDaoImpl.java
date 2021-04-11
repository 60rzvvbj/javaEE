package spring4.com.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;
import spring4.com.dao.StudentDao;
import spring4.com.po.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student selectStudentBySno(int sno) {
        String sql = "select * from stu where sno = ?";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql, sno);
        Student res = new Student();
        res.setSno(sno);
        res.setSn((String) map.get("sn"));
        res.setSsex((String) map.get("ssex"));
        res.setSnative((String) map.get("snative"));
        res.setMno((int) map.get("mno"));
        return res;
    }

    @Override
    public List<Student> selectStudentBySn(final String sn) {
        String sql = "select * from stu where sn = ?";
        final List<Student> list = new LinkedList<>();
        jdbcTemplate.query(sql, new Object[]{sn}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                Student student = new Student();
                student.setSn(sn);
                student.setSno(resultSet.getInt("sno"));
                student.setSsex(resultSet.getString("ssex"));
                student.setSnative(resultSet.getString("snative"));
                student.setMno(resultSet.getInt("mno"));
                list.add(student);
            }
        });
        return list;
    }

    @Override
    public int updateStudent(Student student) {
        String sql = "update stu set sn = ?, ssex = ?, snative = ?, mno = ? where sno = ?";
        Object[] params = new Object[]{
                student.getSn(),
                student.getSsex(),
                student.getSnative(),
                student.getMno(),
                student.getSno()
        };
        return jdbcTemplate.update(sql, params);
    }

    @Override
    public int deleteStudentBySno(int sno) {
        String sql = "delete from stu where sno = ?";
        return jdbcTemplate.update(sql, sno);
    }

    @Override
    public int deleteStudentBySn(String sn) {
        String sql = "delete from stu where sn = ?";
        return jdbcTemplate.update(sql, sn);
    }

    @Override
    public int insertStudent(Student student) {
        String sql = "insert into stu values(?, ?, ?, ?, ?)";
        Object[] params = new Object[]{
                student.getSno(),
                student.getSn(),
                student.getSsex(),
                student.getSnative(),
                student.getMno()
        };
        return jdbcTemplate.update(sql, params);
    }
}
