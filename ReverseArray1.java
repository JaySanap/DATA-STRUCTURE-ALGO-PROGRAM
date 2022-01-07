package com.company;

public class ReverseArray1 {
    //program to reverse an array
    public static void main(String[] args) {
        int[]array1=new int[]{1,2,3,4,5,6,7,8};
        //print array as it is
        System.out.println("The original array is:");
        for (int i=0;i< array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();//blank line
        //print reverse array
        System.out.println("The reverse array is:");
        for (int i= array1.length-1;i>=0;i--){
            System.out.print(array1[i]+" ");
        }

    }
}
