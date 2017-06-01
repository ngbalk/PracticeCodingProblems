package com.sorting;

import com.linkedlists.LinkedListNode;

/**
 * Created by nbalkiss on 5/31/17.
 * O(n2)
 */
public class SelectionSort {

    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int minVal = arr[min];
            arr[min] = arr[i];
            arr[i] = minVal;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {4,2,6,3,1,5,6,7,2,3,11,35,5,13,2,3,4,5,6,6,3,4,0,123,112};
        int[] sorted = SelectionSort.sort(arr);
        for(Integer i : sorted){
            System.out.print(i + " ");
        }

    }
}
