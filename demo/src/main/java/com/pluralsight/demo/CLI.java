package com.pluralsight.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLI implements CommandLineRunner {



    @Override
    public void run(String... args) {
        System.out.println("Hello world from CLI");
    }
}
