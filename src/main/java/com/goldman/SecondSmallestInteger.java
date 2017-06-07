package com.goldman;

import org.junit.Assert;

/**
 * Created by nbalkiss on 6/2/17.
 */
public class SecondSmallestInteger {

    public static int findSecondSmallest(int[] arr){

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static int findNSmallest(int[] arr, int n){
        int minInd = 0;
        for(int j=0;j<n;j++){
            for(int i=0;i<arr.length;i++){
                if(arr[i]<arr[minInd]){
                    minInd=i;
                }
            }
            if(j==n-1){
                return arr[minInd];
            }
            arr[minInd] = Integer.MAX_VALUE;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {22,4,12,8,7,9,0,2};
        System.out.println(SecondSmallestInteger.findSecondSmallest(arr));
        System.out.println(SecondSmallestInteger.findNSmallest(arr,3));
    }
}
