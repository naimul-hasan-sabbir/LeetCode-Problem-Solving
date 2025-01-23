package com.NaimulHasanSabbir.BinarySearch;

public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0, bottom = rows - 1;

        while (top <= bottom){
            int midRow = top + (bottom - top) / 2;

            if (target > matrix[midRow][cols - 1]){
                top = midRow + 1;
            }else if (target < matrix[midRow][0]){
                bottom = midRow - 1;
            }else{
                break;
            }
        }
        if (!(top <= bottom)){
            return false;
        }
        int row = top + (bottom - top) / 2;

        int low = 0, high = cols - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (matrix[row][mid] == target){
                return true;
            }else if (matrix[row][mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
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
