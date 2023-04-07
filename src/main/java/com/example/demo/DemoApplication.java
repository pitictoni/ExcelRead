package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        List<Facultate> facultati = Imports.getFaculties();

        facultati.stream().forEach(System.out::println);

        SpringApplication.run(DemoApplication.class, args);
    }

}
