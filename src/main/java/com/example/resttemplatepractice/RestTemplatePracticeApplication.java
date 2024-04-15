package com.example.resttemplatepractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestTemplatePracticeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RestTemplatePracticeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var restTemplatePractice = new RestTemplatePractice();
        restTemplatePractice.getResultsFromRestTemplatePractice();
    }
}
