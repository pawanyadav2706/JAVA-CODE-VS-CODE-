import java.util.*;
public class ValidPalindromeii {
    public static void main(String[] args){
        String s = "abca";
        Solution sol = new Solution();
        System.out.println(sol.validpalindrome(s));
    }
}
class Solution {
    public boolean validpalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return check(s,left+1, right) ||
                       check(s,left, right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean check(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
