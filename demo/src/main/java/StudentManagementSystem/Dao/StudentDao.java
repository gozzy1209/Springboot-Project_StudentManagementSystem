package StudentManagementSystem.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StudentManagementSystem.Entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Long> {
    
}
