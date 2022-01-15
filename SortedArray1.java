package com.company;

public class SortedArray1 {

    //method 1
    public static boolean issorted(int arr[]){
        for (int i=0;i< arr.length;i++)
            for (int j=i+1;j< arr.length;j++)
                if (arr[j]<arr[i])
                    return false;
        return true;
    }

    public static void main(String[] args) {
        int arr[]={12,5,56,43,32,23,56,67};
        System.out.println(issorted(arr));
    }
}
