package spring3.com.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import spring3.com.aspect.ToolUpkeep;

import java.lang.reflect.Method;

public class AxeProxyCglib implements MethodInterceptor {

    public Object CreateProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        ToolUpkeep toolUpkeep = new ToolUpkeep();
        toolUpkeep.grind();
        Object res = methodProxy.invokeSuper(o, objects);
        toolUpkeep.repair();
        return res;
    }
}
