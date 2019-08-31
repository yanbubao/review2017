package night.impl;

import night.Animal;

/**
 * @author: yanzx
 * @date: 2019/09/01 01:00
 */
public class Dog implements Animal {
    @Override
    public void sleep() {
        System.out.println("狗哥在睡觉！");
    }

    @Override
    public void eat() {
        System.out.println("狗哥在次饭！");
    }
}
