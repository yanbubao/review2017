package night.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 *
 * @author: yanzx
 * @date: 2019/09/01 01:11
 */
public class MyProxy implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 前置业务
        System.out.println("前置业务");

        // 主业务
        Object result = method.invoke(target, args);

        //后置业务
        System.out.println("后置业务");

        return result;
    }

    /**
     * 01.Object类型委托类对象！
     */
    private Object target;

    /**
     * 02.指定委托类，返回代理类
     *
     * @param obj
     * @return proxy
     */
    public Object createProxy(Object obj) {
        this.target = obj;

        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


}
