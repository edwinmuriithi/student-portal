package com.example.studentapi.controller;

import com.example.studentapi.entity.Student;
import com.example.studentapi.repository.StudentRepository;
import com.example.studentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        Student newStudent = studentService.createStudent(student);
        return newStudent;
    }

    @GetMapping
    public List<Student> viewAll(){
        return studentService.viewAllStudents();
    }
}
