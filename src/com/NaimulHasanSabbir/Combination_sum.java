package com.NaimulHasanSabbir;

import java.util.ArrayList;
import java.util.List;

public class Combination_sum {
    public void combination(int[] candidates, int target, int index, List<Integer>currComb, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<Integer>(currComb));
            return;
        }
        if(target < 0 || index >= candidates.length) return;
        for(int i = index; i < candidates.length; i++){
            currComb.add(candidates[i]);
            combination(candidates,target - candidates[i], i, currComb, result);
            currComb.remove(currComb.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combination(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
}
