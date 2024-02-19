package com.NaimulHasanSabbir;

public class Sort_Colors {
    public void sortColors(int[] nums){
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public void swap(int[] nums, int number1, int number2){
        int temp = nums[number1];
        nums[number1] = nums[number2];
        nums[number2] = temp;
    }
}
