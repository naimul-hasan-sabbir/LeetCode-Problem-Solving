package com.NaimulHasanSabbir.Stack;

import java.util.Stack;

public class SimlifyPath {
    public static String simlifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        StringBuilder sb = new StringBuilder();

        for(char c : (path + "/").toCharArray()){
            if(c == '/'){
                if (sb.toString().equals("..")){
                    if (!stack.isEmpty()){
                        stack.pop();
                    }
                }
                else if (!sb.toString().equals("") && !sb.toString().equals(".")){
                    stack.push(sb.toString());
                }
                sb.setLength(0);
            }else{
                sb.append(c);
            }
        }
        return "/" + String.join("/", stack);
    }
    public static void main(String[] args){
        System.out.print(simlifyPath("/home/"));
    }
}
