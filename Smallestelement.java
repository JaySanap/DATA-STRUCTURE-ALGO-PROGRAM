package com.company;

public class Smallestelement {
    public static void main(String[] args) {
        int []arr={10,30,50,20,80,70,90};
        for (int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j< args.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Smalllest element is:"+arr[0]);
    }
}
