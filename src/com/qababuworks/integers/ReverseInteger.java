package com.qababuworks.integers;

import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user input");

        int num = scanner.nextInt();

        int reversedNum=0;

        while (num!=0){
            int n = num%10;
            reversedNum = n + reversedNum * 10;
            num = num/10;
        }

        System.out.println(reversedNum);
    }
}
