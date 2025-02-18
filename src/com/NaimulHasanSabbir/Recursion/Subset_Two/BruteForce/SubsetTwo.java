package com.NaimulHasanSabbir.Recursion.Subset_Two.BruteForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SubsetTwo {
    public static void recurs(int[] nums, int index, List <Integer> ds, HashSet<String> res) {
        if (index == nums.length){
            Collections.sort(ds);
            res.add(ds.toString());
            return;
        }
        ds.add(nums[index]);
        recurs(nums, index + 1, ds, res);
        ds.remove(ds.size() - 1);
        recurs(nums, index + 1, ds, res);
    }
    public static List<String> subsetWithDup(int[] nums){
        List <String> ans = new ArrayList<>();
        HashSet <String> res = new HashSet<>();
        List <Integer> ds = new ArrayList<>();
        recurs(nums, 0, ds, res);
        for (String s : res){
            ans.add(s);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List <String> ans = subsetWithDup(nums);
        System.out.println(ans);
    }
}
