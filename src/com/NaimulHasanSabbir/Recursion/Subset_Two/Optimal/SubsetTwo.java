package com.NaimulHasanSabbir.Recursion.Subset_Two.Optimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetTwo {
    public static void findSubsets(int[] nums, int index, List<Integer> ds, List<List<Integer>>res){
        res.add(new ArrayList<>(ds));
        for (int i = index; i < nums.length; i++){
            if (i != index && nums[i] == nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            findSubsets(nums, i+1, ds, res);
            ds.remove(ds.size() - 1);
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findSubsets(nums, 0, ds, res);
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(subsetsWithDup(nums));
    }
}
