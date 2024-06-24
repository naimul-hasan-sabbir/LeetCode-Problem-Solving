package com.NaimulHasanSabbir;

public class search_in_a_sorted_2D_matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        boolean result = searchMatrix(arr,16);
        System.out.println(result ? "true" : "false");
    }
}
