package night;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: yanzx
 * @date: 2019/09/01 00:09
 */
public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setSid(resultSet.getInt("sid"));
        student.setSname(resultSet.getString("sname"));
        student.setAge(resultSet.getInt("age"));
        return student;
    }
}
