package com.NaimulHasanSabbir.BinarySearch;

public class CapacityToShipPackages {
    public static int shipWithinDays(int[] weights, int days){
        int low = 0, high = 0;
        for(int w : weights){
            low = Math.max(low, w);
            high += w;
        }
        int res = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, days, mid)){
                res = Math.min(res, mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }
    public static boolean canShip(int[] weights, int days, int mid) {
        int ships = 1, currMid = mid;
        for(int w : weights){
            if(currMid - w < 0) {
                ships++;
                if (ships > days) {
                    return false;
                }
                currMid = mid;
            }
            currMid -= w;
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        System.out.println(shipWithinDays(arr, target));
    }
}
