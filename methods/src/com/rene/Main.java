package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int highScore = calculateScore(true, 1500, 6,100);
        System.out.println("your final score was: "+highScore);
        highScore = calculateScore(false, 500, 3, 0);
        System.out.println("your final score was: "+highScore);

        String name = new String("Tom");
        displayHighScorePosition(name, highScore);
        displayHighScorePosition("Johnny", 1900);
        displayHighScorePosition("Jerry", 1000);
    }

    public  static void displayHighScorePosition(String name, int highScore){
        System.out.println(name+" managed to get into position "+calculateHighscorePosition(highScore)+" on the high score table");

    }
    public static int calculateHighscorePosition(int highScore){
       int position = 4;

       if(highScore >=1_000){
           position =1;
       }else if (highScore >=500){
           position =2;
       }else if (highScore >=100){
           position =3;
       }
       return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score+(levelCompleted*bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
