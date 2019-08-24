package night;

import lombok.Data;
import lombok.ToString;

/**
 * @author: yanzx
 * @date: 2019/08/24 22:50
 */
@Data
@ToString
public class Dog implements Animal{

    public String eat() {
        System.out.println("狗哥在吃饭！");
        return "apple!";
    }

    public void sleep() {
        System.out.println("狗哥在睡觉！");
    }

    public Dog() {
        System.out.println("狗哥的无参构造！");
    }

    public void init(){
        System.out.println("Dog init()!");
    }

    public void destroy(){
        System.out.println("Dog destroy()!");
    }
}
