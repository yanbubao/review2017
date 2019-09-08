package night.advices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author: yanzx
 * @date: 2019/09/08 14:00
 */
public class BeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("target: " + o);
        System.out.println("method: " + method.getName());
        System.out.println("执行前置通知！MethodBeforeAdvice.before");
    }
}
