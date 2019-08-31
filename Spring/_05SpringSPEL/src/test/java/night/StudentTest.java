package night;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yanzx
 * @date: 2019/08/25 23:47
 */
public class StudentTest {


    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
    }
}
