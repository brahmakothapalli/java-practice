package com.qababuworks.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "Selenium Automation";
        char[] charArray = str.toLowerCase().toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();
        for(char ch : charArray) {
            if(characters.containsKey(ch)){
                characters.put(ch, characters.get(ch)+1);
            }else {
                characters.put(ch, 1);
            }
        }

        Set<Character> keySet = characters.keySet();
        for (char c:keySet) {
            if(characters.get(c)>1){
                System.out.println(c +" is duplicate char of times "+characters.get(c));
            }
        }

        Set<Character> mySet = new HashSet<>();

        System.out.println(mySet.add('a'));
        System.out.println(mySet.add('a'));
    }
}
