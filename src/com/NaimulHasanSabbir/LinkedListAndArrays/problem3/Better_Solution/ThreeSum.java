package com.NaimulHasanSabbir.LinkedListAndArrays.problem3.Better_Solution;

import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> triplet(int[] arr){
        HashSet<List<Integer>> st = new HashSet<>();

        for(int i=0; i< arr.length; i++){
            HashSet<Integer> hashSet = new HashSet<>();
            for (int j = i+1; j < arr.length; j++){
                int third = -(arr[i] + arr[j]);
            }
        }

    }
}
