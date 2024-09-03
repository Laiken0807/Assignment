/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_01;

import java.util.Scanner;

/**
 *
 * @author User01
 */
public class Question_01 {

    public static void main(String[] args) {
  
        // Import Scanner
        Scanner kb = new Scanner(System.in);
         // Array to store student information
         Student[] students = new Student[100];
        int studentCount = 0; 

        while (true) {
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("******************************************");
            System.out.print("Enter (1) to launch menu or any other key to exit: ");
            int choice = kb.nextInt();

            if (choice != 1) {
                System.out.println("Exiting application...");
                // a loop to exit the program
                break;
            }

            while (true) {
                System.out.println("Please select one of the following items:");
                System.out.println("(1) Capture a new student");
                System.out.println("(2) Search for a student");
                System.out.println("(3) Delete a student");
                System.out.println("(4) Print student report");
                System.out.println("(5) Exit application");

                int options = kb.nextInt();

                switch (options) {
                    case 1:
                        // Capture a new student
                        System.out.print("Enter a Student ID: ");
                        String studentID = kb.next();
                        System.out.print("Enter a Student Name: ");
                        String name = kb.next();
                        int age = Student.getValidAge(kb);
                        System.out.print("Enter a Student Email: ");
                        String email = kb.next();
                        System.out.print("Enter a Student Course: ");
                        String course = kb.next();

                        Student student = new Student(studentID, name, age, email, course);
                        students[studentCount] = student;
                        studentCount++;
                        System.out.println("The student details have been successfully saved.");
                        break;

                    case 2:
                        // method to search for a student
                        System.out.print("Enter a Student ID to search: ");
                        String id = kb.next();
                        boolean found = false;
                        for (int i = 0; i < studentCount; i++) {
                            if (students[i].getStudentID().equals(id)) {
                                System.out.println("Student is  found:");
                                System.out.println("ID: " + students[i].getStudentID());
                                System.out.println("Name: " + students[i].getName());
                                System.out.println("Age: " + students[i].getAge());
                                System.out.println("Email: " + students[i].getEmail());
                                System.out.println("Course: " + students[i].getCourse());
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Student with ID: " + id + " was not found!");
                        }
                        break;

                   case 3:
    // Delete a student
    System.out.print("Enter Student a ID to delete: ");
    String deleteId = kb.next();
    boolean deleted = false;
    for (int i = 0; i < studentCount; i++) {
        if (students[i].getStudentID().equals(deleteId)) {
            System.out.print("Are you sure you want to delete student " + deleteId + " ? (yes or no): ");
            String response = kb.next();
            if (response.equalsIgnoreCase("yes")) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1]; 
                }
                studentCount--;
                System.out.println("Student with Student ID: " + deleteId + " was deleted!");
            } else {
                System.out.println("Deletion canceled.");
            }
            deleted = true;
            break;

                            }
                        }
                        if (!deleted) {
                            System.out.println("Student with Student ID: " + deleteId + " was not found!");
                        }
                        break;

                    case 4:
                        // Print student report
                        System.out.println("STUDENT REPORT");
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println("Name: " + students[i].getName());
                            System.out.println("ID: " + students[i].getStudentID());
                            System.out.println("Age: " + students[i].getAge());
                            System.out.println("Email: " + students[i].getEmail());
                            System.out.println("Course: " + students[i].getCourse());
                            System.out.println("-------------------------");
                        }
                        break;

                    case 5:
                        // Exit application
                        System.out.println("Exiting application...");
                        return; // Exit the method and end the program

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
//refernce
//Farrell, J. (2023). Java Programming. Tenth ed. Cengage Learning.