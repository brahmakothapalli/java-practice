package com.qababuworks.arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class AddingTwoArrays {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        System.out.println(Arrays.binarySearch(a1, 10));

        Integer[] firstArray = new Integer[]{13,12,11,6,9,3}; //source array
        Integer[] secondArray = new Integer[]{78,34,56,67,2,11,7}; //destination array
        Object[] mergedarray = Stream.of(firstArray, secondArray).flatMap(Stream::of).toArray();
        System.out.println(Arrays.toString(mergedarray));
    }
}
