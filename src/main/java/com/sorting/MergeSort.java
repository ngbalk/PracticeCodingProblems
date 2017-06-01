package com.sorting;

import java.util.Arrays;

/**
 * Created by nbalkiss on 5/31/17.
 * O(logn)
 */
public class MergeSort {

    public int[] sort(int[] arr){
        return divide(arr);
    }

    private int[] divide(int[] arr){
        if(arr.length==1){
            return arr;
        }
        return merge(
                divide(Arrays.copyOfRange(arr,0,arr.length/2)),
                divide(Arrays.copyOfRange(arr,arr.length/2,arr.length)));
    }

    private int[] merge(int[] A, int[] B){
        int[] merged = new int[A.length+B.length];
        int x = 0;
        int y = 0;
        int z = 0;
        while(x < A.length && y < B.length){
            merged[z++] = A[x] < B[y] ? A[x++] : B[y++];
        }
        if(x == A.length){
            while(y<B.length){
                merged[z++] = B[y++];
            }
        }
        else{
            while(x<A.length){
                merged[z++] = A[x++];
            }
        }
        return merged;
    }

    public static void main(String[] args){
        MergeSort ms = new MergeSort();
        int[] arr = {4,2,6,3,3,3,3,3,3,7,7,7,71,1,1,5,6,7,2,3,45345,11,35,5,13,2,3,4,5,6,6,3,4,0,123};
        int[] sorted = ms.sort(arr);
        for(Integer i : sorted){
            System.out.print(i + " ");
        }

    }
}
