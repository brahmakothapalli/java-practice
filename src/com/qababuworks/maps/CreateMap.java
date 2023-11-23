package com.qababuworks.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreateMap {

    public static void main(String[] args) {

        HashMap<String, Integer> employee = new HashMap<>();
        // putting values to map
        employee.put("Sam", 32);
        employee.put("John", 33);
        employee.put("Max", 41);

        // reading the values
        for (Map.Entry<String, Integer> entry : employee.entrySet()) {
            System.out.printf("Employee name is %s and his age is %s%n", entry.getKey(), entry.getValue());
            if(entry.getValue() == 41){
                System.out.println(entry.getKey());
            }
        }

        Set<String> keys = employee.keySet();

    }
}
