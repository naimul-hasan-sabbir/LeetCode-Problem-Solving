package com.NaimulHasanSabbir;

public class submatrix_sum_queries {
    static void preProcess(int[][] mat, int aux[][]){
        for(int i = 0; i < mat[0].length; i++){
            aux[0][i] = mat[0][i];
        }
        for(int i = 1; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                aux[i][j] = mat[i][j] + aux[i-1][j];
            }
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 1; j < mat[0].length; j++){
                aux[i][j] += aux[i][j-1];
            }
        }
    }
    static int sumQuery(int[][]aux, int tli, int tlj, int rbi, int rbj){
        int res = aux[rbi][rbj];

        if(tli > 0){
            res = res - aux[tli-1][rbj];
        }

        if(tlj > 0){
            res = res - aux[rbi][tlj-1];

        }
        if(tli > 0 && tlj > 0){
            res = res + aux[tli-1][tlj - 1];
        }
        return res;
    }
    public static void main(String[] args){
        int mat[][] = {{1, 2, 3, 4, 6},
                {5, 3, 8, 1, 2},
                {4, 6, 7, 5, 5},
                {2, 4, 8, 9, 4}};

        int aux[][] = new int[mat.length][mat[0].length];

        preProcess(mat, aux);

        int tli = 2, tlj = 2, rbi = 3, rbj = 4;
        System.out.print("\nQuery1: "
                + sumQuery(aux, tli, tlj, rbi, rbj));

        tli = 0; tlj = 0; rbi = 1; rbj = 1;
        System.out.print("\nQuery2: "
                + sumQuery(aux, tli, tlj, rbi, rbj));

        tli = 1; tlj = 2; rbi = 3; rbj = 3;
        System.out.print("\nQuery3: "
                + sumQuery(aux, tli, tlj, rbi, rbj));
    }
}
