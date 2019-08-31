package night;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @author: yanzx
 * @date: 2019/09/01 00:07
 */
public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {


    @Override
    public int addStudent(Student student) {
        String sql = "insert into student(sname,age) values(?,?)";
        return getJdbcTemplate().update(sql, student.getSname(), student.getAge());
    }

    @Override
    public int delStudent(Student student) {
        String sql = "delete from  student where sid=?";
        return getJdbcTemplate().update(sql, student.getSid());
    }

    @Override
    public int updateStudent(Student student) {
        String sql = "update student set sname=?,and age=? where sid=?";
        return getJdbcTemplate().update(sql, student.getSname(), student.getAge(), student.getSid());
    }

    @Override
    public List<Student> findAllStudents() {
        String sql = "select * from student";
        return getJdbcTemplate().query(sql, new StudentRowMapper());
    }
}
