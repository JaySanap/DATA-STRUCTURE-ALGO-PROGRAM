package com.company;
//arr[]=[10,20,30,40,50,60,70,80,90,100,110}
//srch=80;
public class BinarySearch1 {
    public static void main(String[] args) {
        //take sorted array
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        //variables
        int srch = 80;
        int li = 0;//lower index
        int hi = arr.length - 1;//higher index
        int mi = (li + hi) / 2;//midle index
        while (li <= hi) {

            //search if mi==srch
            if (arr[mi] == srch) {
                System.out.println(" element is present at " + mi + " index postion ");
                break;

            } else if (arr[mi] < srch) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            // create new mi
            mi = (li + hi) / 2;
            if (li > hi) {
                System.out.println(" element not found ");
            }

        }
    }
}