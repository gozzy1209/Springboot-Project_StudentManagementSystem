package StudentManagementSystem.ServiceImpl;
import java.util.List;

import org.springframework.stereotype.Service;

import StudentManagementSystem.Dao.StudentDao;
import StudentManagementSystem.Entity.Student;
import StudentManagementSystem.Service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao){
        super();
        this.studentDao=studentDao;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }//视频21分钟

    @Override
    public Student savStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentDao.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentDao.deleteById(id);
    }

    
    
}
