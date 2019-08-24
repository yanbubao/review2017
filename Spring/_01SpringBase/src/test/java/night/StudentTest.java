package night;

import night.dao.StudentDao;
import night.dao.StudentDaoImpl;
import night.service.StudentService;
import night.service.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author: yanzx
 * @date: 2019/08/22 23:38
 */
public class StudentTest {

    @Test
    public void test01() {
        // 之前耦合的方式
        StudentServiceImpl studentService = new StudentServiceImpl();
        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentService.setStudentDao(studentDao);
        studentService.sayHello();
    }

    @Test
    public void test02() {
        // 通过Spring容器创建对象
        ApplicationContext ApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService = (StudentService) ApplicationContext.getBean("studentServiceImpl");
        studentService.sayHello();
    }


    /**
     * 验证单例模式
     * 01.默认是单例
     * 02.之后再xml文件中的student2  增加属性scope="prototype"
     * 03.再次验证  两个对象肯定不一致
     */
    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("*******************************************");
        Student student = (Student) context.getBean("student2");
        System.out.println(student);
        Student student2 = (Student) context.getBean("student2");  //再次获取
        System.out.println(student == student2);

    }
}
