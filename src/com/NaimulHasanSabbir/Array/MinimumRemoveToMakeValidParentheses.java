package com.NaimulHasanSabbir.Array;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public static String minRemoveToMakeValid(String s){
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <sb.length(); i++){
            if (sb.charAt(i) == '('){
                stack.push(i);
            }
            if(sb.charAt(i) == ')'){
                if (!stack.isEmpty()){
                    stack.pop();
                }else{
                    sb.setCharAt(i, '*');
                }
            }
        }
        while(!stack.isEmpty()){
            sb.setCharAt(stack.pop(), '*');
        }
        return sb.toString().replaceAll("\\*", "");
    }
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }
}
