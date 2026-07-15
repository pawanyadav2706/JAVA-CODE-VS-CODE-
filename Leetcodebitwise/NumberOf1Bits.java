import java.util.*;
public class NumberOf1Bits {
    public static void main(String [] args){
        // int n = 11;
        int n = 124;
        Solution s = new Solution();
        int result  = s.hammingweight(n);
        System.out.println(result);
    }
}
class Solution {
    public int hammingweight(int n){
        int count = 0;
        while(n > 0){
            if(n % 2 == 1){
                count++;
            }
            n = n / 2;
        }
        return count;
    }
}