package night.exception;

/**
 * @author: yanzx
 * @date: 2019/09/08 14:40
 */
public class UserServiceImpl implements ExceptionService {

    @Override
    public boolean checkUser(String userName, Integer age) throws UserException {

        if(!"admin".equalsIgnoreCase(userName)){
            throw new UserNameException("用户名错误！");
        }

        if(age < 18){
            throw new UserAgeException("用户年龄必须大于18岁！");
        }

        return true;
    }
}
