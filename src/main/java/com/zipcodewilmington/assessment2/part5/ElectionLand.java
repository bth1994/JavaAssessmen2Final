package com.zipcodewilmington.assessment2.part5;

import java.util.*;

public class ElectionLand {

    public String electionWinner(String[] votes) {
        TreeMap<String, Integer> voteMap = new TreeMap<>();
        for(String name : votes) {
            voteMap.put(name, countVotes(votes, name));
        }

        ArrayList<String> names = new ArrayList<>();
        int maxValue = Collections.max(voteMap.values());

        for(Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            if(entry.getValue() == maxValue) {
                names.add(entry.getKey());
            }
        }

        Collections.sort(names);
        return names.get(names.size() - 1);

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

}
