/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_02;

/**
 *
 * @author User01
 */
public abstract class Character {
   
    protected int[] answers;
    protected String result;

    public Character(int[] answers) {
        this.answers = answers;
        determineCharacter();
    }

    protected abstract void determineCharacter();

    public String getResult() {
        return result;
    }
}

//reference
//Farrell, J. (2023). Java Programming. Tenth ed. Cengage Learning.
