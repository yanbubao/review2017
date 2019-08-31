package night;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yanzx
 * @date: 2019/08/25 23:38
 */
public class PersonTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
