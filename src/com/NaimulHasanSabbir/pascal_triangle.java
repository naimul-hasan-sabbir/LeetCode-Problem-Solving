package com.NaimulHasanSabbir;

import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {
    public static List<Integer> generateRow(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.addLast(1);
        for(int col = 1; col < row; col++){
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = generateRow(i);
            ans.addLast(temp);
        }
        return ans;
    }
}
