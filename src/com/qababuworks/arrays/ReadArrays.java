package com.qababuworks.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadArrays {

    public static void main(String[] args) {

        List<String> tools = new ArrayList<>();
        tools.add("selenium");
        tools.add("playwright");
        tools.add("cypress");
        tools.add("katalon");
        // before Java 8
        System.out.println("******* Method 1 ********");
        for (String tool:tools) {
            System.out.println(tool);
        }
        System.out.println("********* Method 1 End ************");

        // Java 8
        System.out.println("********* Method 2 ********");
        tools.forEach(System.out::println);
        System.out.println("********* Method 2 End ********");

        // Using Iterator
        System.out.println("********* Method 3 ********");
        Iterator<String> iterator = tools.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("********* Method 3 End ********");
    }
}
