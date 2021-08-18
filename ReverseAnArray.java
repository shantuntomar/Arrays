package com.company;

public class ReverseAnArray {

    static void reverse(int arr[] , int low , int high) {

        if(low >= high) {
            return;
        }

        int temp=0;
        temp=arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        reverse(arr , low+1 , high-1);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reverse(arr , 0 , arr.length-1);

        for(int i :  arr) {
            System.out.print( i + " ");
        }

    }

}
