package com.company;

public class SearchMin {
    public static void main(String[] args) {
        //take an array
        int[]arr={10,3,4,6,9,11,15,20,22};
        //variable
        int min=arr[0];
        //traverse from index 1
        for (int i=1;i< arr.length;i++)
        {
            if (min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(" Minimun element is "+min);
    }
}
