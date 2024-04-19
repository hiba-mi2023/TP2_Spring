package com.example;

// InMemoryStudentRepository.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {
    private Map<Integer, Student> studentMap;

    public InMemoryStudentRepository() {
        studentMap = new HashMap<Integer, Student>();
    }

  
    public void save(Student student) {
        studentMap.put(student.getId(), student);
    }

    
    public Student findById(int id) {
        return studentMap.get(id);
    }

    
    public List<Student> findAll() {
        return new ArrayList<Student>(studentMap.values());
    }
}
