package com.NaimulHasanSabbir;

public class majority_element_SDE_Sheet {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int count = 0, el = 0;

        for (int i = 0; i < len; i++) {
            if (count == 0){
                count = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                count++;
            }else{
                count--;
            }
        }
        int count_majority = 0;
        for (int i = 0; i < len; i++) {
            if(nums[i] == el) count_majority++;
        }
        if(count_majority > len/2) return el;
        return -1;
    }
}
