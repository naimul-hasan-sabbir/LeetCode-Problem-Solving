package com.NaimulHasanSabbir;

public class reorder_an_array_according_to_given_indexes {
    static void reorder(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >= 0) {
                int index = arr[i], value = i;
                while(index != i){
                    int temp = arr[index];
                    arr[index] = -(value + 1);
                    value = index;
                    index = temp;
                }
                arr[index] = -(value + 1);
            }
        }
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = -1 * arr[i] - 1;
        }
    }
}
