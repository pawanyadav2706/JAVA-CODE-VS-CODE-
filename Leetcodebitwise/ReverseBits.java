import java.util.*;
public class ReverseBits {
    public static void main(String [] args){
        int n = 43261596;
        Solution s = new Solution();
        System.out.println(s.reversebits(n));
    }
}
class Solution {
    public int reversebits(int n){
        int ans = 0;
        for(int i=0; i<32; i++){
            ans = ans <<= 1;
            ans = ans |= (n & 1);
            n >>>= 1;
        }
        return ans;
    }
}