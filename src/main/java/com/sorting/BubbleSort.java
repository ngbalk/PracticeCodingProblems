package com.sorting;

/**
 * Created by nbalkiss on 6/1/17.
 * O(n2)
 */
public class BubbleSort {

    public static int[] sort(int[] arr){

        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i] > arr[i+1]){
                    int tmp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                    sorted = false;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {4,2,6,3,1,5,6,7,2,3,11,35,5,13,2,3,4,5,6,6,3,4,0,123,112};
        int[] sorted = BubbleSort.sort(arr);
        for(Integer i : sorted){
            System.out.print(i + " ");
        }

    }
}
