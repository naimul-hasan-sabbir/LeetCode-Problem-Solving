package com.NaimulHasanSabbir.BinarySearch;

public class SquareRootX {
    public static int mySqrt(int x){
        if(x == 0 || x == 1){
            return x;
        }

        int low = 1;
        int high = x;

        while(low <= high){
            int mid = low + (high - low) / 2;
            long val = (long) mid * mid;
            if (val == (long) x){
                return mid;
            }
            else if(val < (long) x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }
    public static void main(String[] args){
        int number = 2147395599;
        System.out.println(mySqrt(number));
    }
}
