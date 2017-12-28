package com.practice.arraydemo;

public class ArrayDemo {
    public static void main(String[] args) {
        //declare array of integers
//        int[] anArray;

        //allocate memory for  10 integers
//        anArray = new int[10];

        //initialize elements
//        anArray[0] = 100;
//        anArray[1] = 200;
//        anArray[2] = 300;
//        anArray[3] = 400;
//        anArray[4] = 500;
//        anArray[5] = 600;
//        anArray[6] = 700;
//        anArray[7] = 800;
//        anArray[8] = 900;
//        anArray[9] = 1000;

        //better way to initialize elements
        int[] anArray =  {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        for(int i=0; i<10; i++) {
            System.out.println("Element at index" + i + ":" + anArray[i]);
        }

//        System.out.println("Element at index 0: "
//                + anArray[0]);
//        System.out.println("Element at index 7: "
//                + anArray[7]);
//        System.out.println("Element at index 9: "
//                + anArray[9]);
    }
}
