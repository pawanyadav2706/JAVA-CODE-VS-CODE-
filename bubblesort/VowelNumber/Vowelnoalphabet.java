import java.util.*;
public class Vowelnoalphabet {
    public static void main(String [] args){
        String str = "Apple";

        Solution sol = new Solution();
        System.out.println(sol.alphabet(str));
    } 
}
class Solution {
    public String alphabet(String str){
         String ans = "";
        for(int i =0;i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'A'){
                ans = ans + 'B';
            }else{
                ans = ans + ch;
            }
        }
        return ans ;
        
    }
}
