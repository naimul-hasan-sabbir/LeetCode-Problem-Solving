package com.NaimulHasanSabbir;

public class minimum_penalty_for_a_shop {
    public int bestClosingTime(String cust) {
        int n = cust.length();
        int[] prefix = new int[n+1];
        int[] suffix = new int[n+1];

        for(int i=1; i<=n; i++){
            prefix[i] = prefix[i-1];
            if(cust.charAt(i-1) == 'N'){
                prefix[i]++;
            }
        }

        for(int i = n -1; i >= 0; i--){
            suffix[i] = suffix[i+1];
            if(cust.charAt(i) == 'Y'){
                suffix[i]++;
            }
        }
        int min_penalty = Integer.MAX_VALUE, idx =0;

        for(int i = 0; i <= n; i++){
            int penalty = prefix[i] + suffix[i];
            if(penalty < min_penalty){
                min_penalty = penalty;
                idx = i;
            }
        }
        return idx;
    }
}
