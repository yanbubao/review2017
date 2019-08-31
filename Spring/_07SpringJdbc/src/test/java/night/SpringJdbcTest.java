package night;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: yanzx
 * @date: 2019/09/01 00:12
 */
public class SpringJdbcTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService = (StudentService) context.getBean("studentServiceImpl");
        List<Student> students = studentService.findAllStudents();

        System.out.println(students);
    }
}
