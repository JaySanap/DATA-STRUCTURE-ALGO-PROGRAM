package com.company;
//arr=[5,3,6,1,4,2]
//item=[1]
public class LinearSearch1 {
    public static void main(String[] args) {
        //take an array
        int []arr={5,3,6,1,4,2};
        //variable
        int item=1;
        //traverse an array
        for (int i=0;i< arr.length;i++)
        {
            //item==arr[i]
            if (item==arr[i])
            {
                System.out.println("item is present at "+i+" index position");
            }
        }
    }
}
