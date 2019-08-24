package night;

import lombok.Data;

import java.util.*;

/**
 * @author: yanzx
 * @date: 2019/08/24 23:39
 */
@Data
public class PropertiesBean {

    private String name;
    private int age;
    private Student student;
    private List<String> list = new LinkedList<>();
    private Set<String> set = new HashSet<String>();
    private Map<String, Object> map = new HashMap<>();
    private Properties properties = new Properties();
    private String[] names = new String[5];

}
