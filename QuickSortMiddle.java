package com.company;

public class QuickSortMiddle {
    public static void main(String[] args) {
        int arr[]={15,9,7,13,12,16,4,18,11};
        int length=arr.length;
        QuickSortMiddle qsm=new QuickSortMiddle();
        qsm.quicksortrecursion(arr,0,length-1);
        qsm.printarray(arr);

    }
    //to fin pivot element
    int divide(int[] arr,int high,int low)
    {
        int pivot=arr[(low+high)/2];
        while (low<=high)
        {
            while (arr[low]<pivot)
            {
                low++;
            }
            while (arr[high]>pivot)
            {
                high--;
            }
            if (low<=high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;

    }
    void quicksortrecursion(int[] arr,int low,int high)
    {
        int di=divide(arr,low,high);
        if (low<di-1)
        {
            quicksortrecursion(arr,low,di-1);
        }
        if (di<high)
        {
            quicksortrecursion(arr,low,high);
        }
    }
    void printarray(int[] arr)
    {
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
