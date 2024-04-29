package com.NaimulHasanSabbir;

public class maximize_the_expression {
    public static int[] find_max_weighted_triplets(int[] arr, int p, int q, int r) {
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = arr[0];
        rightMax[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = arr[i] > arr[leftMax[i - 1]] ? i : leftMax[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = arr[i] > arr[rightMax[i + 1]] ? i : rightMax[i + 1];
        }

        int res = Integer.MIN_VALUE;
        int[] indices = new int[3];
        for(int j = 1; i < n -1; i++){
            int currSum = p * arr[leftMax[j - 1]] + q * arr[j] + r * arr[rightMax[j + 1]];
            if(currSum > res){
                res = currSum;
                indices[0] = leftMax[j - 1];
                indices[1] = j;
                indices[2] = rightMax[j + 1];
            }
        }
        return indices;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int P = 1, Q = 2, R = 3;
        int[] result = find_max_weighted_triplets(arr, P, Q, R);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}
