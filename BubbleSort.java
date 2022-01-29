package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={10,50,30,60,40,20,80,100,110};
        int temp;
        //traverse fot loop for rounds
        for (int i=0;i< arr.length;i++)
        {
            int flag=0;
            //traverse for compare
            for (int j=0;j< arr.length-1-i;j++)
            {
                //condition
                if (arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;


                }
            }
            if (flag==0)
            {
                break;
            }



        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
