package com.NaimulHasanSabbir;

public class First_and_last_position {
    public int[] searchRange(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        int start, end;

        int ans1 = -1;
        int ans2 = -1;

        int mid = left + (right - left) / 2;

        while(left <= right){
            if(nums[mid] == target){
                ans1 = mid;
                right = mid - 1;
            }else if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        left = 0;
        right = nums.length - 1;

        mid = left + (right - left) / 2;

        while(left <= right){
            if(nums[mid] == target){
                ans2 = mid;
                left = mid + 1;
            } else if (nums[mid] <= target) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return new int[]{ans1, ans2};
    }
}
