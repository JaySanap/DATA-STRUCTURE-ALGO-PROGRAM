package com.company;

public class MaxDiff2 {
    public static int maxdiffis(int arr[])
    {
        int maxdiff=arr[1]-arr[0];
        int minele=arr[0];
        for (int i=0;i< arr.length;i++)
        {
            if ((arr[i]-minele)>maxdiff)
            {
                maxdiff=arr[i]-minele;
            }
            if (arr[i]<minele)
            {
                minele=arr[i];
            }
        }
        return maxdiff;
    }

    public static void main(String[] args) {
        int arr[]={10,40,60,20,30,50};
        System.out.println(maxdiffis(arr));
    }
}
