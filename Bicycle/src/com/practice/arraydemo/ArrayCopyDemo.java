package com.practice.arraydemo;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
//        char[] copyTo = new char[7];
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

//        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));

        String thingsStuff;
        System.out.println(thingsStuff);


        int some = Arrays.binarySearch(copyFrom, 'i');
        System.out.println(some);

        boolean outcome = java.util.Arrays.equals(copyFrom, copyTo);
        System.out.println(outcome);

        char[] sortArray = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };

//        Arrays.sort(sortArray);
        Arrays.parallelSort(sortArray);
        System.out.println(sortArray);
    }
}
