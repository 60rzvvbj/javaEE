package spring2.com.ex01.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Arithmetic arithmetic = (Arithmetic) applicationContext.getBean("arithmeticAdd");
        System.out.println(arithmetic.calc(1.1, 3.3));
    }
}
