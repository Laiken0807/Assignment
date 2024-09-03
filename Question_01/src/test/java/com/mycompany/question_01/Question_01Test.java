/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.question_01;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User01
 */
public class Question_01Test {

    @Test
    public void testStudentCreation() {
        // Arrange
        String studentID = "1234";
        String name = "John Cena";
        int age = 20;
        String email = "john@wwe.com";
        String course = "Computer Science";

     
        Student student = new Student(studentID, name, age, email, course);

        // Assert
        assertEquals("1234", student.getStudentID());
        assertEquals("John Cena", student.getName());
        assertEquals(20, student.getAge());
        assertEquals("john@wwe.com", student.getEmail());
        assertEquals("Computer Science", student.getCourse());
    }

    @Test
    public void testInvalidAge() {
        // Arrange
        Scanner kb = new Scanner(System.in);

        // Simulate invalid age input (below 16)
        int age = Student.getValidAge(new Scanner("15\n18\n"));

        // Assert that the method correctly prompts again and accepts 18 as valid
        assertEquals(18, age);
    }

    @Test
    public void testStudentDeletion() {
        // Arrange
        Student[] students = new Student[3];
        students[0] = new Student("1234", "John Cena", 20, "john@wwe.com", "CS");
        students[1] = new Student("5678", "Jaden Smith", 22, "jaden@song.com", "IT");
        students[2] = new Student("9012", "Jack Brown", 19, "jack@google.com", "CS");

        String deleteId = "5678";
        int studentCount = 3;

        // Act
        boolean deleted = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentID().equals(deleteId)) {
                // Simulate confirmation
                String response = "yes";
                if (response.equalsIgnoreCase("yes")) {
                    for (int j = i; j < studentCount - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    studentCount--;
                    deleted = true;
                    break;
                }
            }
        }

        // Assert
        assertTrue(deleted);
        assertEquals(2, studentCount);
        assertNull(students[2]); // The last element should now be null
    }
}

    

