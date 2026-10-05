import java.util.*;
public class ValidParanthesesString {
    public static void main (String [] args){
        String s  = "(*)";
        Solution sol = new Solution();
        System.out.println(sol.checkValidString(s));
    }
}
class Solution {
    public boolean checkValidString(String s){
        int min = 0;
        int max = 0;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                min++;
                max++;
            } else if (ch == ')'){
                min--;
                max--;
            } else { // root of the condition * 
                min--;
                max++;
            }

            if(max < 0){
                return false;
            }
            if(min < 0){
                min = 0;
            }

        }
        return min == 0;
    }
}
