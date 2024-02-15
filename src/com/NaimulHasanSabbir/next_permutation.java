package com.NaimulHasanSabbir;

public class next_permutation {
    public void nextPermutation(int[] nums){
        if(nums == null || nums.length < 1) return;

        int index1 = -1;
        int index2 = -1;

        for(int i = nums.length - 2; i >= 0;i--){
            if(nums[i] < nums[i + 1]){
                index1 = i;
                break;
            }
        }
        if (index1 == -1) {
            reverse(nums, 0);
        }
        else{
            for(int i = nums.length-1; i >=0; i--){
                if(nums[i] > nums[index1]){
                    index2 = i;
                    break;
                }
            }
            swap(nums, index1, index2);
            reverse(nums, index1 + 1);
        }
    }
    void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length -1;

        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
