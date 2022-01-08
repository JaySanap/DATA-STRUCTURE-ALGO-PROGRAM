package com.company;

public class InsertElementInArray {
    public static void main(String[] args) {
        // take array
        int[]arr={10,20,30,40,50};
        //take variable
        int pos=3;
        int element=100;
        //traverse from last
        for (int i= arr.length-1;i>pos-1;i--){
            arr[i]=arr[i-1];
        }
        //insert element
        arr[pos-1]=element;
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
