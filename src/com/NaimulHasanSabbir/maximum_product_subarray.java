package com.NaimulHasanSabbir;

public class maximum_product_subarray {
    public int maxProduct(int[] nums){
        int len = nums.length;
        int result = nums[0];
        int prefix = 0;
        int suffix = 0;

        for(int i = 0; i < len; i++){
            prefix = (prefix == 0 ? 1 : prefix) * nums[i];
            suffix = (suffix == 0 ? 1 : suffix) * nums[len - 1 - i];

            result = Math.max(result, Math.max(prefix, suffix));
        }
        return result;
    }
}
