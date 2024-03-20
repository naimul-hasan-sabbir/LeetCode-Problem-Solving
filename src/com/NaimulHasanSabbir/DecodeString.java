package com.NaimulHasanSabbir;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        String result = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int index = 0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                index = index * 10 + c - '0';
            } else if (c == '[') {
                countStack.push(index);
                strStack.push(current);
                current = new StringBuilder();
                index = 0;
            } else if (c == ']') {
                StringBuilder temp = current;
                current = strStack.pop();
                for(index = countStack.pop(); index > 0; --index) current.append(temp);
            }else{
                current.append(c);
            }
        }
        return current.toString();
    }
}
