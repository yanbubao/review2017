package night.advices;

import night.exception.UserAgeException;
import night.exception.UserNameException;
import org.springframework.aop.ThrowsAdvice;

/**
 * @author: yanzx
 * @date: 2019/09/08 14:29
 */
public class ExceptionAdvice implements ThrowsAdvice {

    public void afterThrowing(UserNameException e){
        System.out.println("UserNameException");
        System.out.println(e.getMessage());
    }

    public void afterThrowing(UserAgeException e){
        System.out.println("UserAgeException");
        System.out.println(e.getMessage());
    }
}
