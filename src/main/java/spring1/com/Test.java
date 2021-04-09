package spring1.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring1.com.service.Person;
import spring1.com.tools.Axe;
import spring1.com.tools.IronAxe;
import spring1.com.tools.StoneAxe;

public class Test {
    public static void main(String[] args) {
//        Person person = new Person();
//        Axe axe = new IronAxe();
//        person.setAxe(axe);
//        person.useAxe();

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) app.getBean("person");
        person.useAxe();
    }
}
