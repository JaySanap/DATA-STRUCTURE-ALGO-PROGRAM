package com.company;

public class MaxDiff {
    //method1
    public static int maxdiffis(int arr[])
    {
        //variable
        int maxdiff=arr[1]-arr[0];
        int minEle=arr[0];

        for (int i=0;i< arr.length;i++)
        {
            if ((arr[i]-minEle)>maxdiff)
            {
                maxdiff=arr[i]-minEle;
            }
            if (arr[i]<minEle)
            {
                minEle=arr[i];
            }
        }
        return maxdiff;

    }

    public static void main(String[] args) {
        int arr[]={2,5,15,6,4};
        System.out.println(maxdiffis(arr));
    }
}
