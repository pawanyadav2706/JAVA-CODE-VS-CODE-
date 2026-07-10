import java.util.*;
public class IntToRoman {
    public static void main(String [] args){
        // int num = 1994;
        int num = 58;
        Solution sol = new Solution();
        System.out.println(sol.inttoroman(num));
    }
}
class Solution {
    public String inttoroman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder ans = new StringBuilder();
        for(int i=0; i<values.length; i++){
            while(num >= values[i]){
                ans.append(romans[i]);
                num -= values[i];
            }
        }
        return ans.toString();
    }
}
