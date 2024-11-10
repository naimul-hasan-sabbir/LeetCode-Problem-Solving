package com.NaimulHasanSabbir.LinkedListAndArrays.problem3.Brute_Force_Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> triplet(int n, int[] arr){
        HashSet<List<Integer>> st = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>(st);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, -1, -2, -3, -4, -5};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        for(List<Integer> list : ans){
            System.out.print("[");
            for(int i : list){
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
}
