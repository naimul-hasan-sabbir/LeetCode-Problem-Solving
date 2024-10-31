package com.NaimulHasanSabbir.Array;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    static int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0,len = 0;
        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
