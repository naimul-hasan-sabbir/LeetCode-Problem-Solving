package com.NaimulHasanSabbir.Stack;

import java.util.Stack;

public class BaseBallGame {
    public int calPoints(String[] operations){
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            }
            else if (op.equals("C")) {
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        BaseBallGame game = new BaseBallGame();
        String[] operations = {"5","2","C","D","+"};
        System.out.println(game.calPoints(operations));
    }
}
