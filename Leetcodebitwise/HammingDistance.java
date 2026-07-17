import java.util.*;
public class HammingDistance {
    public static void main(String [] args){
        // int x = 1;
        // int y = 4;
        int x = 3;
        int y = 1;
        Solution s = new Solution();
        int result = s.hammingdistance(x, y);
        System.out.println(result);
    }
}
class Solution {
    public int hammingdistance(int x, int y){
        int xor = x ^ y;
        int count = 0;
        while(xor > 0){
            if((xor % 2) == 1){
                count++;
            }
            xor = xor / 2;
        }
        return count;
    }
}