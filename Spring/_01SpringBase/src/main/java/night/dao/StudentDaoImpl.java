package night.dao;

/**
 * @author: yanzx
 * @date: 2019/08/22 23:25
 */
public class StudentDaoImpl implements StudentDao {

    public StudentDaoImpl() {
        System.out.println("StudentDaoImpl实例化！");
    }

    public void sayHello() {
        System.out.println("学生打招呼方法！");
    }

    public String eat() {
        System.out.println("学生吃饭方法！");
        return "apple";
    }
}
