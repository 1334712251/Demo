package com.net.function.Demo9;

public class BInarySearchTest {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(BInarySearch(arr, 1));
    }

    public static int BInarySearch(int arr[], int data){
        int low=0;
        int length=arr.length-1;;
        while (low <=length){
            int mid = low + (length-low)/2;
            if (arr[mid]<data){
                low = mid+1;
            }else if (arr[mid]==data){
                return mid;
            }else {
                length = mid -1;
            }
        }
        return -1;
    }
}
