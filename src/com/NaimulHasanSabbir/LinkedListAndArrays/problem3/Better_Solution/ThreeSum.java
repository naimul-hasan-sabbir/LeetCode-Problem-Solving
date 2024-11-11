package com.NaimulHasanSabbir.LinkedListAndArrays.problem3.Better_Solution;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> triplet(int[] arr){
        HashSet<List<Integer>> st = new HashSet<>();

        for(int i=0; i< arr.length; i++){
            HashSet<Integer> hashSet = new HashSet<>();
            for (int j = i+1; j < arr.length; j++){
                int third = -(arr[i] + arr[j]);

                if(hashSet.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashSet.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = triplet(arr);
        for(List<Integer> list : ans){
            System.out.print("[");
            for(int it: list){
                System.out.print(it+" ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
}
