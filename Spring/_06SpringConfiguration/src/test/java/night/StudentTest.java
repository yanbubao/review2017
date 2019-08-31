package night;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yanzx
 * @date: 2019/08/31 22:25
 */
public class StudentTest {

    @Test
    public void test(){
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-student.xml", "spring-grade.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
