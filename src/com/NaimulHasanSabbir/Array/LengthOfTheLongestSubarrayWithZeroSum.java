package com.NaimulHasanSabbir.Array;

import java.util.HashMap;

public class LengthOfTheLongestSubarrayWithZeroSum {
    static int maxLen(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum == 0){
                max = i + 1;
            }else{
                if(map.get(sum) != null){
                    max = Math.max(max, map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxLen(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
