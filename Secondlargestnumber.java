package com.company;

public class Secondlargestnumber {
    public static void main(String[] args) {
        int []arr={5,6,3,8,9,2,10,12,67,45};
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
        System.out.print("Second Largest number is:"+arr[1]);
    }
    }

