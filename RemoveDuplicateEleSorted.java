package com.company;

public class RemoveDuplicateEleSorted {
    public static void main(String[] args) {
        //take sorted array
        int arr[]={1,2,2,3,4,5,5};
        //decleare variable
        int j=0;
        //create temp array of arr length
        int temp[]=new int[arr.length];
        //traverse till arr-1
        for (int i=0;i< arr.length-1;i++)
        {
            if (arr[i]!=arr[i+1])
            {
                temp[j]=arr[i];
                j++;
            }
        }
        temp [j]=arr[arr.length-1];
        for (int i=0;i< temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
