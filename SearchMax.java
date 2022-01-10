package com.company;

public class SearchMax {
    public static void main(String[] args) {
        //take an array
        int[]arr={10,3,4,6,9,11,15,20,22};
        //variable
        int max=arr[0];
        //traverse an array from index 1
        for (int i=1;i< arr.length;i++)
        {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(" Maximum element is "+max);
    }
}
