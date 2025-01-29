package com.NaimulHasanSabbir.BinarySearch;

import java.util.Arrays;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r){
            int k = l + (r - l) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }
            if (totalTime <= h){
                res = k;
                r = k - 1;
            }
            else{
                l = k + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int target = 8;

        System.out.println(minEatingSpeed(arr, target));
    }
}
