/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_02;

import java.util.Scanner;

/**
 *
 * @author User01
 */
public class Question_02 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("You're about to do a Strawhat Quiz! ");
        System.out.println("Please answer the following questions with numbers (1-5)");

        int[] answers = new int[5];
        String[] questions = {
            "What do you value the most in life?\n" + 
                "1. Friendship and keeping a smile on your face \n" +
                "2. Strength, integrity and loyalty\n" + 
                "3. Dreams\n" +
                "4. Knowledge\n" + 
                "5. Wealth\n",
            "How do you handle challenges?\n" +
               "1. By being valiant and carefree\n" +
               "2. With careful strategic planning  and teamworkskills\n" +
               "3. With a bit of creativity and room for improvisation\n" +
               "4. With the help of others\n" +
               "5. With a focus on the reward\n",
            "What motivates you?\n" +
               "1. The desire to protect those around you\n" +
               "2. The need to prove oneself to become your best self\n" +
               "3. The thrill of adventure\n" +
               "4. The pursuit of knowledge\n" +
               "5. The promise of wealth and fame\n",
            "How do you interact with others?\n" +
               "1. You're a great leader\n" +
               "2. You're a bit of a loner \n" +
               "3. You're a jokester\n" +
               "4. You're a good listener\n" +
               "5. You're a bit of a manipulator\n",
            "What do you hope to achieve in life?\n" +
               "1. To become the the king of the pirates\n" +
               "2. To master the greatest skill and become the best\n" +
               "3. To find the greatest treasure and be proud\n" +
               "4. To make a difference in the world and be remembered\n" +
               "5. To live a life of luxury and be set for life\n" };

        for (int i = 0; i < 5; i++) {
            System.out.println(questions[i]);
            System.out.print("Which number do you pick? : ");
            answers[i] = kb.nextInt();
        }

        Character character = new Strawhat(answers);
        System.out.println("Your Strawhat character is: " + character.getResult());
    }
}
//reference
//Farrell, J. (2023). Java Programming. Tenth ed. Cengage Learning.
    

