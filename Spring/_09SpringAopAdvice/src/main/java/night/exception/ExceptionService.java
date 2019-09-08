package night.exception;

/**
 * 验证异常通知的接口
 *
 * @author: yanzx
 * @date: 2019/09/08 14:40
 */
public interface ExceptionService {

    boolean checkUser(String userName, Integer age) throws UserException;
}
