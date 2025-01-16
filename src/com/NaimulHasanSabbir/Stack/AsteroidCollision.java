package com.NaimulHasanSabbir.Stack;

import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids){
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0){
                int diff = asteroid + stack.peek();
                if (diff < 0){
                    stack.pop();
                }
                else if (diff > 0){
                    asteroid = 0;
                }
                else{
                    asteroid = 0;
                    stack.pop();
                }
            }
            if (asteroid != 0){
                stack.add(asteroid);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int[] test = new int[]{5,10,-5};
        System.out.println(asteroidCollision(test));
    }
}
