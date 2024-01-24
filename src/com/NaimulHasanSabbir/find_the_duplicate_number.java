package com.NaimulHasanSabbir;

public class find_the_duplicate_number {
    public int findDuplicate(int[] nums){
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
