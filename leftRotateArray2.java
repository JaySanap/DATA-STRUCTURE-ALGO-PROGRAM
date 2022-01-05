package com.company;
///5  4
///12345
public class leftRotateArray2 {
    ///method 1
    ///to left rotate an array by d element

    void leftRotate(int arr[],int d,int n)
    {
        //creating an temp array
        int temp[]=new int[d];
        //copying first d element in temp
        for (int i=0;i<d;i++)
            temp[i]=arr[i];
        //moving the rest element to index
        for (int i=d;i<n;i++)
            arr[i-d]=arr[i];
        //copying temp array inn orignal array
        for (int i=0;i<d;i++)
            arr[i+n-d]=temp[i];


    }
    //method 2
    //to printarray
    void PrintArray(int arr[],int n)
    {
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    //method 3
    //main driver method

    public static void main(String[] args) {

        //creating an object of class inside main()
        leftRotateArray2 rotate=new leftRotateArray2();
        //input array
        int arr[]={1,2,3,4,5};
        //calling method 1 and 2
        rotate.leftRotate(arr,4,arr.length);
        rotate.PrintArray(arr, arr.length);



    }
}
