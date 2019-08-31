package night;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao;

    @Override
    public int addStudent(Student student) {
        return dao.addStudent(student);
    }

    @Override
    public int delStudent(Student student) {
        return dao.delStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    public StudentDao getDao() {
        return dao;
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }
}
