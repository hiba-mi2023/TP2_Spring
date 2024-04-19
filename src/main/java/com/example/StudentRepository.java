package com.example;

import java.util.List;

//StudentRepository.java
public interface StudentRepository {
 void save(Student student);
 Student findById(int id);
 List<Student> findAll();
}
