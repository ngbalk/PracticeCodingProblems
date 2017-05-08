package com.stacksandqueues;

import java.util.Stack;

/**
 * Created by nbalkiss on 4/26/17.
 */
public class LargestRectangleInHistogram {
    public static int largestRectangle(int[] histogram){
        Stack<Integer> pos = new Stack<Integer>();
        Stack<Integer> heights = new Stack<Integer>();
        int largestSoFar = 0;
        for(int i=0;i<histogram.length;i++){

            //stack is empty so push any new rectangle
            if(pos.isEmpty()){
                pos.push(i);
                heights.push(histogram[i]);
                continue;
            }

            //continuation of existing rectangle
            else if(histogram[i]==heights.peek()){
                continue;
            }

            //ended some rectangles height potential, so lets calculate the best they did
            while(histogram[i]<heights.peek()){
                int area = (i-pos.pop())*heights.pop();
                if(area>largestSoFar){
                    largestSoFar = area;
                }
                if(heights.isEmpty()){
                    break;
                }
            }
            pos.push(i);
            heights.push(histogram[i]);
        }

        // finish up non-closed rectangles
        while(!heights.isEmpty()){
            int area = (histogram.length-pos.pop())*heights.pop();
            if(area>largestSoFar){
                largestSoFar = area;
            }
        }
        return largestSoFar;
    }
}
