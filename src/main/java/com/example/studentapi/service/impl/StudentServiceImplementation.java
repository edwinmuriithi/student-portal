package com.example.studentapi.service.impl;

import com.example.studentapi.entity.Student;
import com.example.studentapi.repository.StudentRepository;
import com.example.studentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student createStudent(Student student) {
        student.setName(student.getName());
        student.setEmail(student.getEmail());
        student.setDob(student.getDob());
        student.setAge(student.getAge());
        Student newStudent = studentRepository.save(student);
        return newStudent;
    }
}
