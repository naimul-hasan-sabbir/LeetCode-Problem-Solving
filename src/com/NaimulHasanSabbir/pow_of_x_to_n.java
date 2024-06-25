package com.NaimulHasanSabbir;

public class pow_of_x_to_n {
    public double myPow(double x, int n) {
        double res = 1.0;
        long nn = n;

        if(n < 0) nn = -1 * nn;

        while(nn > 0){
            if(nn % 2 == 1){
                res *= x;
                nn = nn - 1;
            }else{
                x = x * x;
                nn = nn / 2;
            }
        }
        if(n < 0) res = 1.0 / res;
        return res;
    }
}
