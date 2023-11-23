package com.qababuworks.strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWords {

    public static void main(String[] args) {

        String str = "Selenium is powerful automation tool and selenium is open source and selenium tool is used for web automation";
        String[] words = str.toLowerCase().split(" ");
        HashMap<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }

        }
        System.out.println("******** Duplicate Words Are *************");
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.printf("The word '%s' is repeated %s times%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
