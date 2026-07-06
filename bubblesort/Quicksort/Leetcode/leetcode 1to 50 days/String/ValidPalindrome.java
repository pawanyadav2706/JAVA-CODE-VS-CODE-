import java.util.*;
public class ValidPalindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(s));

    }
}
class Solution {
    public boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString().equals(s);
    }
}