package com.NaimulHasanSabbir.Array;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> result = new ArrayList<Integer>();
        int nl = String.valueOf(low).length();
        int nh = String.valueOf(high).length();

        for(int i = nl; i <= nh; i++){
            for(int j = 0; j < 10 - i; j++){
                int num = Integer.parseInt(digits.substring(j, j + i));
                if(num >= low && num <= high){
                    result.add(num);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> result = sequentialDigits(100, 300);
        System.out.println(result);
    }
}
