import java.util.*;
public class Maxnestiong {
    public static void main(String [] args){
        String s = "(1+(2*3)+((8)/4))+1";
        Solution sol = new Solution();
        System.out.println(sol.maxDepth(s));
    }
}
class Solution {
    public int maxDepth(String s){
        int current = 0;
        int max = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                current++;
                max = Math.max(max, current);
            }else if(ch == ')'){
                current--;
            }
        }
        return max;
    }
}
