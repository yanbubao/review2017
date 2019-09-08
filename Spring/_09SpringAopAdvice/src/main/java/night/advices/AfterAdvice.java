package night.advices;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author: yanzx
 * @date: 2019/09/08 14:08
 */
public class AfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("target: " + target);
        System.out.println("returnValue: " + returnValue);
        System.out.println("method: " + method.getName());
        System.out.println("执行后置通知！AfterReturningAdvice.afterReturning");
    }
}
