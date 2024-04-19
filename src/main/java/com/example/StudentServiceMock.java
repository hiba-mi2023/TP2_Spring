package com.example;

// StudentServiceMock.java
import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService {
    private List<Student> mockData;

    public StudentServiceMock() {
        mockData = new ArrayList<Student>();
        // Ajoutez ici les données fictives pour la simulation
    }

    public void createStudent(Student student) {
        mockData.add(student);
    }

    
    public Student findStudentById(int id) {
        for (Student student : mockData) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

  
    public void displayAllStudents() {
        for (Student student : mockData) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}
