package com.NaimulHasanSabbir.Recursion.Combination_Sum_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_Two {
    public static void findCombination(int ind, int[] arr, int target, List<List<Integer>> res, List<Integer> ds){
        if (target == 0){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind; i < arr.length; i++){
            if(i > ind && arr[i] == arr[i - 1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }
            ds.add(arr[i]);
            findCombination(i + 1, arr, target - arr[i], res, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        findCombination(0, candidates, target, res, new ArrayList<>());
        return res;
    }
    public static void main(String[] args){
        int[] arr = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(arr, 8));
    }
}
