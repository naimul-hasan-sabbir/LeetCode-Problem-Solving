package com.NaimulHasanSabbir;

public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int res = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                res++;
            }
        }
        return res;
    }
}
