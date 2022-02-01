package com.company;

import java.util.HashSet;

public class RemoveDuplicateEleUnsorted {
    public static void main(String[] args) {
        //take unsortted or sorted array
        int arr[]={1,4,6,8,8,2,2,9};
        //create an object of hashset
        HashSet<Integer>hs=new HashSet<>();
        //traverse an array
        for (int i=0;i< arr.length;i++)
        {

            //add array in hashset
            hs.add(arr[i]);
        }
        //print hashset as it does not print duplicate element
        for (int no:hs)
        {
            System.out.print(no+" ");
        }
    }
}
