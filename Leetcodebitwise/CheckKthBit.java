import java.util.*;
public class CheckKthBit {
    public static void main(String [] args){
        int n = 4;
        int k = 2;
        Solution s = new Solution();
        System.out.println(s.iskthbits(n , k));
    }
}
class Solution {
    public boolean iskthbits(int n , int k){
        return (n & (1 << k)) != 0;
    }
}
