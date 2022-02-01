package com.company;

public class Thirdlaargestnumber {
    public static void main(String[] args) {
        int []arr={100,300,400,500,200,600};
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
        System.out.print("Third Largest number is:"+arr[2]);
    }
    }

