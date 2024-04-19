package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.*;

public class Main {
    public static void main(String[] args) {
        // Création du contexte Spring à partir de la configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Récupération du bean StudentService à partir du contexte
        StudentService studentService = context.getBean(StudentService.class);

        // Création de quelques étudiants
        Student student1 = new Student(1, "imane", "mi", 20);
        Student student2 = new Student(2, "chaimae", "mejdoubi", 22);

        // Ajout des étudiants via le service
        studentService.createStudent(student1);
        studentService.createStudent(student2);

        // Recherche d'un étudiant par son ID
        Student foundStudent = studentService.findStudentById(1);
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent.getFirstName() + " " + foundStudent.getLastName());
        } else {
            System.out.println("Student not found.");
        }

        // Affichage de tous les étudiants
        System.out.println("All students:");
        studentService.displayAllStudents();

        // Fermeture du contexte Spring
        context.close();
    }
}

