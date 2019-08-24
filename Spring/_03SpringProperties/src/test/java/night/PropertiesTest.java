package night;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yanzx
 * @date: 2019/08/25 01:00
 */
public class PropertiesTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // by set
        Grade grade = (Grade) context.getBean("grade");
        System.out.println(grade);

        // by p-namespace
        Student student = (Student) context.getBean("student");
        System.out.println(student);

        // by constructor
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

        // by c-namespace
        Student student2 = (Student) context.getBean("student1");
        System.out.println(student2);

        PropertiesBean propertiesBean = (PropertiesBean) context.getBean("propertiesBean");
        System.out.println(propertiesBean);
    }

}
