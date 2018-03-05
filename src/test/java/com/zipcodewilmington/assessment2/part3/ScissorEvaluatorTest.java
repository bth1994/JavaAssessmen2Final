package com.zipcodewilmington.assessment2.part3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/1/18.
 */
public class ScissorEvaluatorTest implements EvaluatorTestInterface{
    @Test
    public void evaluateWinnerTest() {
        RockPaperScissors input = RockPaperScissors.SCISSORS;
        RockPaperScissors expected = RockPaperScissors.ROCK;

        RockPaperScissors actual = input.getWinningSign();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluateLoserTest() {
        RockPaperScissors input = RockPaperScissors.SCISSORS;
        RockPaperScissors expected = RockPaperScissors.PAPER;

        RockPaperScissors actual = input.getLosingSign();

        Assert.assertEquals(expected, actual);
    }
}
