package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudent() {
        return List.of(
                new Student(1L, "Aditya Vittal Chowta", 31, LocalDate.of(1990, Month.OCTOBER, 02), "aditya.chowta@gmail.com"),
                new Student(2L, "Tony Stark", 45, LocalDate.of(1990, Month.OCTOBER, 20), "tony.stark@gmail.com"));
    }
}
