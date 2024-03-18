package com.NaimulHasanSabbir;

public class Rotate_Array {
    public void rotate(int[] nums, int k){
        k = k % nums.length;
        if(k < 0){
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    public static void reverse(int[] nums, int i, int j){
        int left_index = i;
        int right_index = j;

        while(left_index < right_index){
            int temp = nums[left_index];
            nums[left_index] = nums[right_index];
            nums[right_index] = temp;

            left_index++;
            right_index--;
        }
    }
}
