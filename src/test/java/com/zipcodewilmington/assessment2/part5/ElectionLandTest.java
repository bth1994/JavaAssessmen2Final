package com.zipcodewilmington.assessment2.part5;

import org.junit.Assert;
import org.junit.Test;

public class ElectionLandTest {

    @Test
    public void electionWinnerTest1(){
        String[] votes = {"Alex","Michael","Harry","Dave","Michael","Victor","Harry","Alex","Mary","Mary"};
        ElectionLand electionLand = new ElectionLand();
        String expected = "Michael";
        String actual = electionLand.electionWinner(votes);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void electionWinnerTest2(){
        String[] votes = {"Victor", "Veronica","Ryan", "Dave", "Maria", "Maria", "Farah", "Farah", "Ryan", "Veronica"};
        ElectionLand electionLand = new ElectionLand();
        String expected = "Veronica";
        String actual = electionLand.electionWinner(votes);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void electionWinnerTest3(){
        String[] votes = {"Alice", "Allison", "Alice", "Allison", "Ashley","Ashley"};
        ElectionLand electionLand = new ElectionLand();
        String expected = "Ashley";
        String actual = electionLand.electionWinner(votes);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void electionWinnerTest4(){
        String[] votes = {"hfail" ,"bz","hfail","ru" ,"fkqb","fkqb"
               ,"hfail","ru","ru","hfail","bz","fkqb","bz","bz"
               ,"fkqb","bz","fkqb","ru","fkqb","ru","ru","bz"
               ,"hfail","fkqb","hfail","bz","hfail","ru","hfail" ,"bz"
               ,"bz" ,"bz" ,"fkqb","ru","fkqb","hfail","fkqb","bz"
               ,"bz","hfail","hfail","hfail","bz","hfail","ru"
               ,"ru","hfail","hfail","bz","hfail"};
        ElectionLand electionLand = new ElectionLand();
        String expected = "hfail";
        String actual = electionLand.electionWinner(votes);
        Assert.assertEquals(expected, actual);
    }
}
