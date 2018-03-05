package com.zipcodewilmington.assessment2.part6;

import java.util.Arrays;

public class LoveLetter {

    public Integer[] mystery(String[] input) {
        Integer[] encrypted = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            encrypted[i] = howManyChanges(input[i]);
        }
        return encrypted;
    }

    public Integer howManyChanges(String input) {
        int count = 0;
        for(int i = 0; i < input.length() / 2; i++) {
            count += Math.abs(input.charAt(i) - input.charAt(input.length() - i - 1));
        }
        return count;
    }

    public static void main(String[] args) {
        LoveLetter lv = new LoveLetter();

        String[] input = {"abc"};
        System.out.println(input[0].charAt(0));
        System.out.println(input[0].charAt(2));
    }

}
