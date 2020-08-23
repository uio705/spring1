package Proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserDaoProxy implements InvocationHandler {
    private Object target;
    public Object getProxy(Object object){
        this.target=object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object result = null;
        if(methodName.indexOf("find")>=0){
            result=method.invoke(target,args);

        }else{
            System.out.println("开始事务");
            result=method.invoke(target,args);
            System.out.println("结束事务");
        }
        return result;
    }
}
