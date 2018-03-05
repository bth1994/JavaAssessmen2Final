package com.zipcodewilmington.assessment2.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ElectionLand {

    public String electionWinner(String[] votes) {
        String[] winner = new String[1];
        String[] previous = new String[1];

        for(String name : votes) {
            int highest = 0;

            int current = countVotes(votes, name);

            if(current > highest) {
                highest = current;
                winner[0] = name;
                previous[0] = name;
            } else if (current == highest) {
                winner[0] = decisionIfTie(votes, winner[0], previous[0]);
                previous[0] = decisionIfTie(votes, winner[0], previous[0]);

            }
        }
        return winner[0];
    }

    public String decisionIfTie(String[] votes, String name1, String name2) {
        Arrays.sort(votes);
        ArrayList<String> voteAsArrayList = new ArrayList<>(Arrays.asList(votes));
        if(voteAsArrayList.indexOf(name1) > voteAsArrayList.indexOf(name2)) {
            return name1;
        }
        return name2;
    }

    public Integer countVotes(String[] votes, String name) {
        Integer count = 0;
        for(String key: votes) {
            if(key.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ElectionLand el = new ElectionLand();
        String[] votes = {"Alex","Michael","Harry","Dave","Michael","Victor","Harry","Alex","Mary","Mary"};
        System.out.println(el.countVotes(votes, "Michael"));
    }
}
