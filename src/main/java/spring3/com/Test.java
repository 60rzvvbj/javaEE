package spring3.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring3.com.dao.Axe;
import spring3.com.dao.impl.StealAxe;
import spring3.com.proxy.AxeProxyCglib;
import spring3.com.proxy.AxeProxyJdk;

public class Test {
    public static void main(String[] args) {
        Axe axe = new StealAxe();

//        AxeProxyJdk axeProxyJkd = new AxeProxyJdk();
//        Axe pAxe = (Axe) axeProxyJkd.createProxy(axe);

//        AxeProxyCglib axeProxyCglib = new AxeProxyCglib();
//        Axe pAxe = (Axe) axeProxyCglib.CreateProxy(axe);

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Axe pAxe = (Axe) app.getBean("stealAxeProxy");

        pAxe.chop();
    }
}
