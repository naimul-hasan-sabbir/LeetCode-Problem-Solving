package com.NaimulHasanSabbir.String.Group_Anagrams;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = g.groupAnagrams(words);
        System.out.println(res);
    }
}
