package com.NaimulHasanSabbir;

import java.util.ArrayList;
import java.util.List;

public class majority_elements_n_by_3 {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;

        int counter_1 = 0, counter_2 = 0;
        int element_1 = Integer.MIN_VALUE;
        int element_2 = Integer.MIN_VALUE;

        for(int i = 0; i < len; i++) {
            if(counter_1 == 0 && nums[i] != element_2){
                counter_1 = 1;
                element_1 = nums[i];
            }else if(counter_2 == 0 && nums[i] != element_1){
                counter_2 = 1;
                element_2 = nums[i];
            }else if(element_1 == nums[i]) counter_1++;
            else if (element_2 == nums[i]) {
                counter_2++;
            }else{
                counter_1--;
                counter_2--;
            }
        }
        List<Integer> result = new ArrayList<Integer>();

        counter_1 = 0; counter_2 = 0;
        for(int i = 0;i < len; i++) {
            if(nums[i] == element_1){
                counter_1++;
            }
            if(nums[i] == element_2) {
                counter_2++;
            }
        }
        int minimum = (len / 3) + 1;
        if(counter_1 >= minimum) result.add(element_1);
        if(counter_2 >= minimum) result.add(element_2);

        return result;
    }
}
