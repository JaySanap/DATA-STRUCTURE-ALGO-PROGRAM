package com.company;

public class Largestnumber {
    public static void main(String[] args) {
        int []arr={10,40,50,20,30,70,80,100,120};
        for (int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j< arr.length;j++)
            {
                if (arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }


        }
        System.out.print("Largest number is:"+arr[0]);
    }
}
