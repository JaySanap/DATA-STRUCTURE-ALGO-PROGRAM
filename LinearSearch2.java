package com.company;
//arr=[10,20,30,40,50,60]
//item=50;
public class LinearSearch2 {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50,60};
        int item=50;
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]==item)
            {
                System.out.println(" item is present at "+i+" index position ");
            }
        }
    }
}
