package com.stacksandqueues;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by nbalkiss on 4/26/17.
 */
public class FindNearestSmallerElement {
    public static int[] findNearestSmallest(int[] A){
        int[] G = new int[A.length];
        Stack<Integer> stk = new Stack<Integer>();
        int smallestSoFar = A[0];
        for(int i=0;i<A.length;i++){
            if(smallestSoFar<A[i]){
                Enumeration<Integer> en = stk.elements();
                while(en.hasMoreElements()){
                    int cur = en.nextElement();
                    if(cur<A[i]){
                        G[i]=cur;
                    }
                }
            }
            else{
                G[i] = -1;
            }
            stk.push(A[i]);
            if(A[i]<smallestSoFar){
                smallestSoFar=A[i];
            }
        }
        return G;
    }
}
