package com.pluralsight.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pluralsight.demo.dao.RegistrationDAO;
import com.pluralsight.demo.model.Student;


@Component
public class RegistrationService {

    private final RegistrationDAO registrationDAO;

    // Autowired tells Spring to automatically inject a
    // object into this constructor when a RegistrationService
    // is created, more on this later

    // When there’s only one constructor with args, @autowired
    // is optional

    @Autowired
    public RegistrationService(RegistrationDAO registrationDAO) {
        this.registrationDAO = registrationDAO;
    }

    public Long registerStudent(Student student) throws
            StudentAlreadyRegisteredException {

        if (this.registrationDAO.findById(student.getId())!= null) {
            throw new StudentAlreadyRegisteredException();
        }

        return registrationDAO.persistStudent(student);
    }

//    public Student getStudentById(lo id) {
//        return this.registrationDAO.findById()
//    }
}
