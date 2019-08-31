package night;

import java.util.List;

/**
 * @author: yanzx
 * @date: 2019/09/01 00:10
 */
public interface StudentService {

    int addStudent(Student student);

    int delStudent(Student student);

    int updateStudent(Student student);

    List<Student> findAllStudents();
}
