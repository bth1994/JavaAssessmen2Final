package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    ROCK,
    PAPER,
    SCISSORS;

     public RockPaperScissors getWinningSign() {
        if(this == RockPaperScissors.ROCK) {
            return RockPaperScissors.PAPER;
        } else if (this == RockPaperScissors.PAPER) {
            return RockPaperScissors.SCISSORS;
        } else if (this == RockPaperScissors.SCISSORS) {
            return RockPaperScissors.ROCK;
        }
        return null;
    }

    public RockPaperScissors getLosingSign() {
        if(this == RockPaperScissors.ROCK) {
            return RockPaperScissors.SCISSORS;
        } else if (this == RockPaperScissors.PAPER) {
            return RockPaperScissors.ROCK;
        } else if (this == RockPaperScissors.SCISSORS) {
            return RockPaperScissors.PAPER;
        }
        return null;
    }
}