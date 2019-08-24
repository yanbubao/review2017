package night;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yanzx
 * @date: 2019/08/24 22:54
 */
public class AnimalTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog dog = (Dog) context.getBean("dog");
        dog.eat();

        // 手动关闭ioc容器，观察bean的destroy方法！
        context.close();
    }
}
