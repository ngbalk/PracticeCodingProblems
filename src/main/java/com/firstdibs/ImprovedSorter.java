package com.firstdibs;

import java.util.Arrays;

/**
 * Created by nbalkiss on 6/6/17.
 * modified selection sort
 */
public class ImprovedSorter {

    public static String[] sort(String s, String order){
        String[] arr = s.split("");
        for(int i=0;i<arr.length;i++){
            int minInd = i;
            for(int j=i;j<arr.length;j++){
                if(!order.contains(arr[minInd])){
                    minInd=j;
                }
                else if(!order.contains(arr[j])){
                    continue;
                }
                else if(order.indexOf(arr[j])<order.indexOf(arr[minInd])){
                    minInd = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        String case1String = "banana";
        String case1Order = "nab";
        System.out.println(Arrays.toString(ImprovedSorter.sort(case1String,case1Order)));
        String case2String = "house";
        String case2Order = "soup";
        System.out.println(Arrays.toString(ImprovedSorter.sort(case2String,case2Order)));

    }
}
