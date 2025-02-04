package com.NaimulHasanSabbir.BinarySearch;

public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums){
        int left = 0, right = nums.length -1;

        int res = nums[0];

        while(left <= right){
            if (nums[left] < nums[right]){
                res = Math.min(res, nums[left]);
                break;
            }

            int mid = left + (right - left) / 2;
            res = Math.min(res, nums[mid]);
            if (nums[mid] >= nums[left]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {2,1};
        System.out.println("Smallest Number is: " + findMin(arr));
    }
}
