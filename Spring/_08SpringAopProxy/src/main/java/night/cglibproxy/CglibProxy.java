package night.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: yanzx
 * @date: 2019/09/01 01:28
 */
public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置业务");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("后置业务");
        return result;
    }

    private Enhancer enhancer;

    /**
     * @param clazz 委托类
     * @return 代理类
     */
    public Object createProxy(Class clazz) {

        // 设置公共的接口、类
        enhancer.setSuperclass(clazz);

        // 建立委托关系
        enhancer.setCallback(this);

        return enhancer.create();

    }

    public Enhancer getEnhancer() {
        return enhancer;
    }

    public void setEnhancer(Enhancer enhancer) {
        this.enhancer = enhancer;
    }
}
