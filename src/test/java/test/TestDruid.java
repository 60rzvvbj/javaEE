package test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class TestDruid {
    @Test
    public void test() throws IOException, SQLException {
//        Properties pro = new Properties();
//        InputStream is = TestDruid.class.getClassLoader().getResourceAsStream("druid.properties");
//        pro.load(is);
//        DruidDataSource ds = new DruidDataSource();
//        ds.setDriverClassName(pro.getProperty("driverClassName"));
//        ds.setUrl(pro.getProperty("url"));
//        ds.setUsername(pro.getProperty("username"));
//        ds.setPassword(pro.getProperty("password"));
//        System.out.println(ds);
//        Connection conn = ds.getConnection();
//        System.out.println(conn);
//        conn.close();

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource ds = (DruidDataSource) app.getBean("dataSource");
        Connection conn = ds.getConnection();
        System.out.println(conn);
        conn.close();
    }
}
