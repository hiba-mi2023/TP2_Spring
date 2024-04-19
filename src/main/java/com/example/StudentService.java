package com.example;

// StudentService.java
public interface StudentService {
    void createStudent(Student student);
    Student findStudentById(int id);
    void displayAllStudents();
}
