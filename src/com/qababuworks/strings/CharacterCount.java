package com.qababuworks.strings;

import java.util.Arrays;

public class CharacterCount {

    public static void main(String[] args) {
        String str = "Selenium";
        char ch = 'e';
        int count = 0;
        char[] charArray = str.toLowerCase().toCharArray();
        for (char c :charArray) {
            if(ch == c){
                count++;
            }
        }
        System.out.println("Char 'e' count = "+count);

        // using Stream API

        long len = str.chars().filter(c -> c == 'e').count();
        System.out.println(len);

    }
}
