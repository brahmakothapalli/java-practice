package com.qababuworks.integers;

public class Palindrome {

    public static void main(String[] args) {
        int num = 73737;
        int givenNum = num;
        int reversed = 0;
        while(num!=0){
            int n = num % 10;
            reversed = n + reversed * 10;
            num = num/10;
        }

        if(givenNum == reversed){
            System.out.println("Palindrome");
        }
    }
}
