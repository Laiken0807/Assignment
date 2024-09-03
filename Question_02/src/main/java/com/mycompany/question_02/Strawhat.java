/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_02;

/**
 *
 * @author User01
 */
    public class Strawhat extends Character {
    public Strawhat(int[] answers) {
        super(answers);
    }

    @Override
    protected void determineCharacter() {
        int luffyCount = 0;
        int roronoaCount = 0;
        int usoppCount = 0;
        int chopperCount = 0;
        int namiCount = 0;

        for (int answer : answers) {
            switch (answer) {
                case 1:
                    luffyCount++;
                    break;
                case 2:
                    roronoaCount++;
                    break;
                case 3:
                    usoppCount++;
                    break;
                case 4:
                    chopperCount++;
                    break;
                case 5:
                    namiCount++;
                    break;
            }
        }

        if (luffyCount > roronoaCount && luffyCount > usoppCount && luffyCount > chopperCount && luffyCount > namiCount) {
            result = "You are Monkey D. Luffy!";
        } else if (roronoaCount > luffyCount && roronoaCount > usoppCount && roronoaCount > chopperCount && roronoaCount > namiCount) {
            result = "You are Zoro!";
        } else if (usoppCount > luffyCount && usoppCount > roronoaCount && usoppCount > chopperCount && usoppCount > namiCount) {
            result = "You are Usopp!";
        } else if (chopperCount > luffyCount && chopperCount > roronoaCount && chopperCount > usoppCount && chopperCount > namiCount) {
            result = "You are Chopper!";
        } else {
            result = "You are Nami!";
        }
    }
}

//refernce
//Farrell, J. (2023). Java Programming. Tenth ed. Cengage Learning.