package com.example.StudentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudentManagementApplication{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		
//		
//		Student st1 = new Student("Rishi" , "Pandey" , "pandeyrishi@gmail.com");
//		studentRepository.save(st1);
//		
//		
//		Student st2 = new Student("Maharshi" , "Pandey" , "pandey@gmail.com");
//		studentRepository.save(st2);
//		
//		
//		
//		
//	}

}
