import java.util.*;
public class ReverseDegreeofaString {
    public static void main(String [] args){
        // String s = "abc";
        String s = "zaza";
        Solution sol = new Solution();
        System.out.println(sol.reverseDegree(s));
    }
}
class Solution {
     public int reverseDegree(String s){
        int sum = 0;
        for(int i = 0; i< s.length(); i++){
            int reverse = 26 - (s.charAt(i) - 'a');
            sum = sum + (reverse * (i + 1));
        }
        return sum;
    }
}
