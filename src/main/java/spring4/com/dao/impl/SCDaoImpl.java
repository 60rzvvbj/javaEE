package spring4.com.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import spring4.com.dao.SCDao;
import spring4.com.po.SC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SCDaoImpl implements SCDao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<SC> selectAllSC() {
        String sql = "select * from sc";
        final List<SC> list = new LinkedList<>();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                SC sc = new SC();
                sc.setSno(resultSet.getInt("sno"));
                sc.setCno(resultSet.getInt("cno"));
                sc.setTno(resultSet.getInt("tno"));
                sc.setPs(resultSet.getDouble("ps"));
                sc.setKs(resultSet.getDouble("ks"));
                sc.setZp(resultSet.getDouble("zp"));
                list.add(sc);
            }
        });
        return list;
    }
}
