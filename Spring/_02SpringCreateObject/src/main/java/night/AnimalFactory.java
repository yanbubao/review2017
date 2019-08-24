package night;

/**
 * @author: yanzx
 * @date: 2019/08/24 22:57
 */
public class AnimalFactory {

    public AnimalFactory() {
        System.out.println("AnimalFactory构造方法！");
    }

    public static Animal getDog(){
        System.out.println("静态工厂中创建狗哥！");
        return new Dog();
    }

    public Animal getDog2(){
        System.out.println("动态工厂中创建狗哥！");
        return new Dog();
    }
}
