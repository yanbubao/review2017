package night.advices;

import night.bean.User;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author: yanzx
 * @date: 2019/09/08 14:13
 */
public class AroundAdvice implements MethodInterceptor {

    /**
     * 在前置通知之后！后置通知之前！
     * 可获取目标方法的返回值，并改变其值！
     *
     * @param invocation
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("执行环绕通知逻辑！base目标方法之前");

        Object result = invocation.proceed();
        if(result != null){
            result = new User(2,"被aop修改了！",23);
        }

        System.out.println("执行环绕通知逻辑！base目标方法之后");

        return result;
    }
}
