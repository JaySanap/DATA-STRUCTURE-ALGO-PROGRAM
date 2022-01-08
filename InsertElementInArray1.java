package com.company;

public class InsertElementInArray1 {
    public static void main(String[] args) {
        //take an array
        int[]arr={10,20,30,40,50};
        // take variables
        int index_pos=2;
        int element=100;
        //traverse from last
        for (int i= arr.length-1;i>index_pos;i--){
            arr[i]=arr[i-1];
        }
        //insert element
        arr[index_pos]=element;
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
