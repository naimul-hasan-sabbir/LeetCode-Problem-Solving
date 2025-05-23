package com.NaimulHasanSabbir.Array;

public class Sort_Colors {
    public static void sortColors(int[] nums){
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
    public static void swap(int[] nums, int number1, int number2){
        int temp = nums[number1];
        nums[number1] = nums[number2];
        nums[number2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
