import java.util.*;
public class BinaryStringtoArray {
    public static void main(String [] args){
        String s = "110";
        Solution sol = new Solution();
        System.out.println(sol.withoutleadingzero(s));

    }
}
class Solution {
    public boolean withoutleadingzero(String s){
        int n = s.length()-1;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
                return false;
            }
        }
        return true;
    }
}
