/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_01;

import java.util.Scanner;

/**
 *
 * @author User01
 */
public class Student {

    private String studentID;
    private String name;
    private int age;
    private String email;
    private String course;

    public Student(String studentID, String name, int age, String email, String course) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public static int getValidAge(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter the student age: ");
                int age = scanner.nextInt();
                if (age >= 16) {
                    return age;
                } else {
                    System.out.println("Invalid age. Please enter an age 16 or older.");
                }
            } catch (Exception e) {
                System.out.println("Invalid age. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    
        }
    //reference
// Farrell, J. (2023). Java Programming. Tenth ed. Cengage Learning.



 




        
   
    








