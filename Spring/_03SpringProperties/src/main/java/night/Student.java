package night;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: yanzx
 * @date: 2019/08/24 23:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private String name;
    private int age;
    private Grade grade;
}
