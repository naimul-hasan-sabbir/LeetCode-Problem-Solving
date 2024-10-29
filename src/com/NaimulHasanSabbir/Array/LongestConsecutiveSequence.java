package com.NaimulHasanSabbir.Array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;

        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < len; i++) {
            set.add(nums[i]);
        }
        for(int elem : set){
            if(!set.contains(elem - 1)){
                int count = 1;
                int x = elem;
                while(set.contains(x+1)){
                    x = x + 1;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestConsecutive(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
