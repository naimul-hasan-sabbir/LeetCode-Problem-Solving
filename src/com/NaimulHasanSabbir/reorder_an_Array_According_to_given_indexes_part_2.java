package com.NaimulHasanSabbir;

public class reorder_an_Array_According_to_given_indexes_part_2 {
    static void reorder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int old_val = arr[i] % arr.length;
            arr[old_val] = arr.length * i + arr[old_val];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / arr.length;
        }
    }
}
