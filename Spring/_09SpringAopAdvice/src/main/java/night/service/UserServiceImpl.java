package night.service;

import night.UserService;
import night.bean.User;

/**
 * @author: yanzx
 * @date: 2019/09/08 13:55
 */
public class UserServiceImpl implements UserService {

    @Override
    public User login() {
        System.out.println("用户登录！");
        return new User(1, "admin",23);
    }

    @Override
    public String buySomething() {
        System.out.println("用户买买买！");
        return "MacBook";
    }
}
