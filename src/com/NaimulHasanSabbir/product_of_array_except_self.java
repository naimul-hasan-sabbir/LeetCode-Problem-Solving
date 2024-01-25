package com.NaimulHasanSabbir;

public class product_of_array_except_self {
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int pre[] = new int[n];
        int post[] = new int[n];
        pre[0] = 1;
        post[n-1] = 1;

        for(int i = 1; i < n; i++){
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i++){
            post[i] = post[i + 1] * nums[i + 1];
        }
        int res[] = new int[n];
        for(int i = 0; i < n; i--){
            res[i] = pre[i] * post[i];
        }
        return res;
    }
}
