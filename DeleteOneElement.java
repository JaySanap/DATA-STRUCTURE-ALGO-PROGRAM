package com.company;

public class DeleteOneElement {
    public static void main(String[] args) {
        //take an array
        int[]arr={10,40,30,80,60,20};
        //variables
        int del_ele=30;
        //traverse an array
        for (int i=0;i< arr.length;i++){
            if (del_ele==arr[i])
            {
                //traverse array from del ele
                for (int j=i;j< arr.length-1;j++){
                    //rotation of element
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        // traverse an array till arr-1
        for (int i=0;i< arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
