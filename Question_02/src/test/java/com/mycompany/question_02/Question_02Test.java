/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.question_02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User01
 */
public class Question_02Test {
    
     @Test
    public void testLuffy() {
        int[] answers = {1, 1, 1, 1, 1}; 
        Strawhat character = new Strawhat(answers);
        assertEquals("You are Monkey D. Luffy!", character.getResult());
    }

    @Test
    public void testZoro() {
        int[] answers = {2, 2, 2, 2, 2}; 
        Strawhat character = new Strawhat(answers);
        assertEquals("You are Zoro!", character.getResult());
    }

    @Test
    public void testUsopp() {
        int[] answers = {3, 3, 3, 3, 3}; // All answers should result in Usopp
        Strawhat character = new Strawhat(answers);
        assertEquals("You are Usopp!", character.getResult());
    }

    @Test
    public void testChopper() {
        int[] answers = {4, 4, 4, 4, 4}; // All answers should result in Chopper
        Strawhat character = new Strawhat(answers);
        assertEquals("You are Chopper!", character.getResult());
    }

    @Test
    public void testNami() {
        int[] answers = {5, 5, 5, 5, 5}; // All answers should result in Nami
        Strawhat character = new Strawhat(answers);
        assertEquals("You are Nami!", character.getResult());
    }

    @Test
    public void testTie() {
        int[] answers = {1, 1, 2, 2, 3}; // This will result in a tie, Nami is the default
        Strawhat character = new Strawhat(answers);
        assertEquals("You are Nami!", character.getResult());
    }
}
    
