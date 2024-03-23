package com.NaimulHasanSabbir;

public class reverse_intiger {
    public int reverse(int x) {
        StringBuilder res = new StringBuilder();
        res.append(Math.abs(x));
        res.reverse();

        if(res.length() >= 10){
            int c1 = Integer.parseInt(res.substring(0, 5));
            int c2 = Integer.parseInt(res.substring(5, 10));

            if(c1 > 21474 || c2 > 83647){
                return 0;
            }
        }
        int num = Integer.parseInt(res.toString());

        return (x < 0) ? -num : num;
    }
}
