package com.NaimulHasanSabbir;

public class moveZeros {
    public void moveZeroes(int[] nums) {
        int zeroBoxSize = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroBoxSize += 1;
            }else if( zeroBoxSize > 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i - zeroBoxSize] = temp;
            }
        }
    }
}
