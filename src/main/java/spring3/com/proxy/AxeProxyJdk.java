package spring3.com.proxy;

import spring3.com.aspect.ToolUpkeep;
import spring3.com.dao.Axe;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AxeProxyJdk implements InvocationHandler {

    private Axe axe;

    public Object createProxy(Axe axe) {
        this.axe = axe;
        ClassLoader classLoader = AxeProxyJdk.class.getClassLoader();
        Class[] classes = axe.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader,classes,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ToolUpkeep toolUpkeep = new ToolUpkeep();
        toolUpkeep.grind();
        Object res = method.invoke(axe, args);
        toolUpkeep.repair();
        return res;
    }
}
