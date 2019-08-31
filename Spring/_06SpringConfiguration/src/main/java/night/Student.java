package night;

import lombok.Data;
import lombok.ToString;

/**
 * @author: yanzx
 * @date: 2019/08/31 22:24
 */
@Data
@ToString
public class Student {

    private String name;
    private int age;
    private Grade grade;
}
