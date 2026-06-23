
import java.util.*;
public class ReplaceString {
    public static void main(String[] args){
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,1,2,3};
        Solution sol = new Solution();
        System.out.println(sol.isreplacestring(s, indices));
    }
}
class Solution{
    public String isreplacestring(String s, int [] indices){
            char[] ans = new char[s.length()];

            for(int i=0; i<s.length(); i++){
                ans[indices[i]] = s.charAt(i);
            }
            return new String(ans);
    }
}
