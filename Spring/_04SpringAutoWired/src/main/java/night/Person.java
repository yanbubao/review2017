package night;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: yanzx
 * @date: 2019/08/25 23:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    private String name;

    private int age;

    private Cat cat;

    private Dog dog;
}
