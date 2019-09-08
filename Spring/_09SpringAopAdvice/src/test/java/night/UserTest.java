package night;

import night.bean.User;
import night.exception.ExceptionService;
import night.exception.UserException;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yanzx
 * @date: 2019/09/08 16:30
 */
public class UserTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) context.getBean("userProxy");
        User user = userService.login();
        System.out.println("***************");

        System.out.println(user);

        /**
         * 执行下面两行会java.lang.ClassCastException，因为目标对象中两个方法的返回值类型不同！
         * 我们在环绕通知之中改变了返回结果，导致此异常！
         */
        /*String msg = userService.buySomething();
        System.out.println(user + " buy " + msg);*/
    }

    @Test
    public void testException(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ExceptionService exceptionService = (ExceptionService) context.getBean("exceptionProxy");

        try {
            //exceptionService.checkUser("error",20);
            exceptionService.checkUser("admin",17);

        } catch (UserException e) {
            e.printStackTrace();
        }
    }
}
