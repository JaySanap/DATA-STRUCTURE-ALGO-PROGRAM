package com.company;

public class DeleteElemenntRe {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        int del_ele=80;
        for (int i=0;i< arr.length;i++){
            if (del_ele==arr[i]){
                for (int j=i;j< arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for (int i=0;i< arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }


    }

