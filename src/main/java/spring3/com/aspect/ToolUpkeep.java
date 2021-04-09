package spring3.com.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ToolUpkeep implements MethodInterceptor {

    public void grind() {
        System.out.println("工具已处于最佳工作状态。");
    }

    public void repair() {
        System.out.println("工具已维修好。");
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        grind();
        Object res = methodInvocation.proceed();
        repair();
        return res;
    }
}
