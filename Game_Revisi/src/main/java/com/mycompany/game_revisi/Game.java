/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game_revisi;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Game{
    private int secretNumber;
    private final int guessLimit;
    
//    Konstruktor
    public Game(int guessLimit){
        this.guessLimit = guessLimit;
    }
    
    public void generateNumber(){
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
    }
    
    public int getGuess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan tebakan anda (1-100): ");
        return scanner.nextInt();
    }
    
    public String checkGuess(int guess){
        if (guess == secretNumber){
            return "Benar!";
        }  else if (guess > secretNumber) {
            return "Terlalu tinggi, coba lagi!";
        } else {
            return "Terlalu rendah, coba lagi!";
        }
    }
    
    public void play(){
        generateNumber();
        int remainingGuesses = guessLimit;
        while (remainingGuesses > 0) {
            int guess = getGuess();
            String feedback = checkGuess(guess);
            System.out.println(feedback);
            if (feedback.equals("Benar!")) {
                break;
            }
            remainingGuesses--;
            System.out.println("Sisa tebakan: " + remainingGuesses);
        }
        if (remainingGuesses == 0) {
            System.out.println("Maaf, Anda kehabisan tebakan. Angka rahasia adalah: " + secretNumber);
        }
    }
}
