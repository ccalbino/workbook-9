package com.pluralsight.demo;

import com.pluralsight.demo.dao.RegistrationDAO;
import com.pluralsight.demo.dao.SimpleRegistrationDAO;
import com.pluralsight.demo.model.Student;
import com.pluralsight.demo.service.RegistrationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication //container
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context; //context is the container
		context = SpringApplication.run(DemoApplication.class, args);

//		for (String bean : context.getBeanDefinitionNames()) {
//			System.out.println(bean);
//		}
//
////		RegistrationDAO registrationDAO = new SimpleRegistrationDAO();
////		RegistrationService registrationService = new RegistrationService(registrationDAO);
//
//		RegistrationService registrationService = context.getBean(RegistrationService.class);
//		Student s = registrationService.getStudentById(10);
//		System.out.println(s.getFirstName());



	}

}
