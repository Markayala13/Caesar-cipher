package org.example;

import java.util.Scanner;

public class Cesar {
    public static void main(String[] args) {
        ///////////////User create word
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to be encrypted:");
        String word = sc.nextLine();
        int displacement = 5;

        ////////////////// empty String
        String secretWord = "";

        /////////////////Iterate over each character in the word.
        for (int i = 0; i < word.length(); i++) {
            char palabra = word.charAt(i);

            if (isUpperCase(palabra)) {
                //////////////////////Convert to ASCII
                int originalPosition = palabra - 'A';
                int newPosition = (originalPosition + displacement) % 26;
                char newChar = (char) ('A' + newPosition);
                secretWord += newChar;
            } else if (isLowerCase(palabra)) {

                int originalPosition = palabra - 'a';
                int newPosition = (originalPosition + displacement) % 26;
                char newChar = (char) ('a' + newPosition);
                secretWord += newChar;
            } else {

                secretWord += palabra;
            }
        }


        System.out.println("Encrypted word: " + secretWord);
    } // <-- Aquí cierra el método main

    ////////////////////Function to verify if a chacater is Upper Case
    public static boolean isUpperCase(char check) {
        return check >= 'A' && check <= 'Z';
    }

    ////////////////////Function to verify if a character is Lower Case
    public static boolean isLowerCase(char check) {
        return check >= 'a' && check <= 'z';
    }
}
