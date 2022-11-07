package StudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import StudentManagementSystem.Dao.StudentDao;
import StudentManagementSystem.Entity.Student;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
//public class DemoApplication{
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private StudentDao studentDao;
	@Override
	public void run(String... args) throws Exception {
		/*Student student1 =new Student("Zhaoyan","Zhang","gozzy1209@foxmail.com");
		studentDao.save(student1);

		Student student2 =new Student("Lejing","Huang","Lejing1209@gmail.com");
		studentDao.save(student2);
		*/

	}

}
