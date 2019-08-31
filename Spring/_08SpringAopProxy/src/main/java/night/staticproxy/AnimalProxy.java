package night.staticproxy;

import night.Animal;
import night.impl.Dog;

/**
 * 静态代理，Dog代理类
 * @author: yanzx
 * @date: 2019/09/01 01:01
 */
public class AnimalProxy implements Animal {

    /**
     * 和委托类建立关系
     */
    private Dog dog;


    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


    @Override
    public void sleep() {
        System.out.println("前置业务");
        dog.sleep();
        System.out.println("后置业务");
    }

    @Override
    public void eat() {
        System.out.println("前置业务");
        dog.eat();
        System.out.println("后置业务");
    }
}
