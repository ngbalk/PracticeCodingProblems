package com.stacksandqueues;

import java.util.Stack;

/**
 * Created by nbalkiss on 4/26/17.
 */
public class SimplifyDirectoryPath {
    public static String simplifyPath(String path){
        Stack<String> stk = new Stack<String>();
        String[] els = path.split("/");
        for(String el : els){
            if(el.equals("..")){
                stk.pop();
            }
            else if(el.equals(".")){
                continue;
            }
            else if(el.equals("")){
                continue;
            }
            else{
                stk.add(el);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append("/");
            sb.append(stk.pop());
        }
        return sb.toString();
    }
}
