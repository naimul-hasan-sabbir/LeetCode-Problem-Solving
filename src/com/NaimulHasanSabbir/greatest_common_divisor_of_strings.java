package com.NaimulHasanSabbir;

public class greatest_common_divisor_of_strings {
    static String gcdOfStrings(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int gcdRes = gcd(n, m);
        String s = str1.substring(0, gcdRes);
        String str = str1 + str2;

        for(int i = 0; i < m + n; i += gcdRes){
            if(!str.startsWith(s, i)){
                return "";
            }
        }
        return s;
    }
    public static int gcd(int n, int m){
        return n == 0 ? m : gcd(m % n, n);
    }
}
