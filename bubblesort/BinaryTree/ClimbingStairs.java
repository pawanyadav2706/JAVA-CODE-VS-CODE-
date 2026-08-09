import java.util.*;
public class ClimbingStairs {
    public static void main(String [] args){
        // int n = 5;
        int n = 10;
        Solution s = new Solution();
        System.out.println(s.climbstairs(n));
    }
}
class Solution {
    public int climbstairs(int n){
        if(n == 1){
            return n;
        }
        int a = 1;
        int b = 2;
        for(int i = 3; i<=n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
