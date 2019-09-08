package night;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yanzx
 * @date: 2019/09/08 23:35
 */
public class UserTest {

    @Test
    public void test() {

        /*ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext-regexp.xml");*/
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) context.getBean("userProxy");
        userService.login();

        System.out.println("*************** 只有login方法被aop增强了！");
        userService.buySomething();
    }
}
