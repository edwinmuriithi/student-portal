package com.example.studentapi.service;

import com.example.studentapi.entity.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentService {

    Student createStudent(Student student);
}
