package com.NaimulHasanSabbir.Stack;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens){
            if (token.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if (token.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            }
            else if (token.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if (token.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        EvaluateReversePolishNotation eval = new EvaluateReversePolishNotation();
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(eval.evalRPN(tokens));
    }
}
