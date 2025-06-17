package com.pluralsight.demo.service;

public class StudentAlreadyRegisteredException extends RuntimeException {
    public StudentAlreadyRegisteredException(String message) {

        super(message);
    }
    public StudentAlreadyRegisteredException(){
        super("Student Already Registered");
    }

}
