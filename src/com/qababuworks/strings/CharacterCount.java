package com.qababuworks.strings;

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

    }
}
