package com.example;

// StudentServiceImpl.java
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

  
    public void displayAllStudents() {
        List<Student> students = studentRepository.findAll();
        System.out.println("Number of students retrieved: " + students.size());
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

}
