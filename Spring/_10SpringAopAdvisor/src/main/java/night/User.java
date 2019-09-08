package night;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: yanzx
 * @date: 2019/09/08 13:57
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private String userName;

    private Integer age;
}
