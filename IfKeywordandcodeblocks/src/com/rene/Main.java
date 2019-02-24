package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(score==4000) {
            System.out.println("look at this");
        }
        score = 1_000;
        levelCompleted = 8;
        bonus =200;
        if(gameOver){
            int finalScore = score +(levelCompleted*bonus);
            System.out.println("Your Final Score was: "+finalScore);
        }
    }
}
