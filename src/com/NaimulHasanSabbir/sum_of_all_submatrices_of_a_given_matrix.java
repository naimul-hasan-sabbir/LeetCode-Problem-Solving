package com.NaimulHasanSabbir;

public class sum_of_all_submatrices_of_a_given_matrix {
    static final int n = 3;

    static int matrixSum(int arr[][]){
        int sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
               int top_left = (i + 1) * (j + 1);

               int bottom_right = (n - i) * (n -j);

               sum += (i + 1) * (j + 1) * (n - i) * (n -j);
            }
        }
        return sum;
    }

    public static void main(String[]args){
        int arr1[][] = new int[][]{{1,1,1},
                {1,1,1},
                {1,1,1}};
        System.out.println(matrixSum(arr1));
    }
}
