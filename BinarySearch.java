package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        //take sorted array
        int[] arr = {2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28};
        //variables
        int srch = 16;
        int li = 0;//lower index
        int hi = arr.length - 1;//higher index
        int mi = (li + hi) / 2;//middle index
        while (li <= hi) {
            if (arr[mi] == srch) {
                System.out.println(" element is present at " + mi + " index position ");
                break;
            } else if (arr[mi] < srch) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            //new mi create
            mi = (li + hi) / 2;
            if (li > hi) {
                System.out.println(" element not found ");
            }
        }


    }
}