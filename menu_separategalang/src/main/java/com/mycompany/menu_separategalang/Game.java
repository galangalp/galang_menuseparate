/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu_separategalang;

/**
 *
 * @author User
 */
public abstract class Game {
    protected int secretNumber;
    protected int guessLimit;
    
    public Game(int guessLimit) {
        this.guessLimit = guessLimit;
    }
    
    public abstract void play();
    public abstract String checkGuess(int guess, String input);
}