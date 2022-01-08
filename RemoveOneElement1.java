package com.company;
//input arr=[30,60,70,90,80,40,50]
//delete=90;
public class RemoveOneElement1 {
    public static void main(String[] args) {
        int[]arr={30,60,70,90,80,40,50};
        int del_ele=90;
        for (int i=0;i< arr.length;i++)
        {
            if (del_ele==arr[i])
            {
                for (int j=i;j< arr.length-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for (int i=0;i< arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
