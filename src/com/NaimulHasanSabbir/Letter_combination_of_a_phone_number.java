package com.NaimulHasanSabbir;

import java.util.LinkedList;

public class Letter_combination_of_a_phone_number {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if(digits.length() == 0) return result;
        result.add("");

        String[] char_map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for(int i = 0; i < digits.length(); i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i){
                String permutation = result.remove();
                for(char c : char_map[index].toCharArray()){
                    result.add(permutation + c);
                }
            }
        }
        return result;
    }
}
