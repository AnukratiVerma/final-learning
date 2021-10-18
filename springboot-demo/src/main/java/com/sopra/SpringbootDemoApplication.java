package com.sopra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sopra.beans.Student;

//@SpringBootApplication(scanBasePackages = "com.sopra.beans")
@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootDemoApplication.class, args);
		
		ApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);
		
		Student student = context.getBean(Student.class);
		student.setId(100);
		student.setName("Anu");
		student.setSalary(300000);
		
		Student s = context.getBean(Student.class);
		s.setId(101);
		s.setName("Shagun");
		s.setSalary(400000);
		
		System.out.println(student);
	}

}
