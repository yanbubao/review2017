package night;

import night.cglibproxy.CglibProxy;
import night.impl.Dog;
import night.proxy.MyProxy;
import night.staticproxy.AnimalProxy;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yanzx
 * @date: 2019/09/01 01:06
 */
public class AnimalTest {

    /**
     * 静态代理实现
     */
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AnimalProxy dogProxy = (AnimalProxy) context.getBean("dogProxy");
        dogProxy.eat();
        System.out.println("**********");
        dogProxy.sleep();
    }

    /**
     * 动态代理实现
     */
    @Test
    public void test2(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog dog = (Dog) context.getBean("dog");

        MyProxy proxy = (MyProxy) context.getBean("proxy");

        Animal animal = (Animal) proxy.createProxy(dog);

        animal.sleep();

    }

    /**
     * 动态代理实现 by cglib
     */
    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog dog = (Dog) context.getBean("dog");

        CglibProxy cglibProxy = (CglibProxy) context.getBean("cglibProxy");

        Dog dogProxy = (Dog) cglibProxy.createProxy(dog.getClass());

        dogProxy.sleep();
    }
}
