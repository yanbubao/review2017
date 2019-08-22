package night.service;


import night.dao.StudentDao;

/**
 * @author: yanzx
 * @date: 2019/08/22 23:28
 */
public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl(){
        System.out.println("StudentServiceImpl实例化！");
    }

    /**
     * 之前耦合的方式
     * 程序本身去创建dao层的实例
     *  StudentDao dao=new StudentDaoImpl();
     */
    private StudentDao studentDao;

    /**
     * 01.只声明了一个studentDao对象
     * 02.需要交给Spring容器
     * 03.等待SpringIOC容器给我们实例化studentDao，通过setStudentDao方法
     *
     * @param studentDao
     */
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void sayHello() {
        studentDao.sayHello();
    }

    public String eat() {
        return studentDao.eat();
    }
}
