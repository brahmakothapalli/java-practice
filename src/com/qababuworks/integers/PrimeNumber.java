package com.qababuworks.integers;

public class PrimeNumber {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 5, 6, 7, 8, 9, 11, 13};
        for (int n : numbers) {
            int count = 0;
            int i = n;
            while(i>1){
                if(n%i == 0){
                    count++;
                }
                i--;
            }
            if(count==1){
                System.out.printf("Prime number %s \n",n);
            }
        }

    }
}
