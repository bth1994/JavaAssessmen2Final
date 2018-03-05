package com.zipcodewilmington.assessment2.part3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/1/18.
 */
public class RockEvaluatorTest implements EvaluatorTestInterface {
    @Test
    public void evaluateWinnerTest() {
        RockPaperScissors input = RockPaperScissors.ROCK;
        RockPaperScissors expected = RockPaperScissors.PAPER;

        RockPaperScissors actual = input.getWinningSign();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluateLoserTest() {
        RockPaperScissors input = RockPaperScissors.ROCK;
        RockPaperScissors expected = RockPaperScissors.SCISSORS;

        RockPaperScissors actual = input.getLosingSign();

        Assert.assertEquals(expected, actual);
    }
}
