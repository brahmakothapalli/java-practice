package com.qababuworks.strings;

public class ReverseGivenString {

    public static void main(String[] args) {
        String str = "qababuworks";

        // method 1
        String reversed = "";
        int strLength = str.length();
        for(int n=strLength-1; n>=0; n--){
            reversed = reversed.concat(String.valueOf(str.charAt(n)));
        }
        System.out.println(reversed);

        // method 2
        StringBuffer bf = new StringBuffer(str);
        System.out.println(bf.reverse());

    }
}
