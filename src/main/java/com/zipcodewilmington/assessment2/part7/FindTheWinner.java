package com.zipcodewilmington.assessment2.part7;

public class FindTheWinner {

    public String winner (Integer[] player1, Integer[] player2, String input) {
        int player1Score = 0;
        int player2Score = 0;

        if(input.equals("Even")) {
            for(int i = 0; i < player1.length; i++) {
                player1Score += player1[i] - player2[i];
                player2Score += player2[i] - player1[i];
            }
        } else {
            for(int i = 1; i < player1.length; i++) {
                player1Score += player1[i] - player2[i];
                player2Score += player2[i] - player1[i];
            }

        }
        if(player1Score > player2Score) {
            return "Leon";
        } else {
            return "Wilhelm";
        }
    }
}
