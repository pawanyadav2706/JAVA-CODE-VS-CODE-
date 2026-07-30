import java.util.*;
public class BinaryGap {
    public static void main(String [] args){
        int n = 21;
        Solution s = new Solution();
        System.out.println(s.binarygap(n));
    }
}
class Solution {
    public int binarygap(int n){
        int prev = -1;
        int max = 0;
        int position = 0;

        while(n > 0){
            if((n & 1) == 1){
                 if(prev != -1){
                max = Math.max(max, position - prev);
            }
                prev = position;
            }
            n >>=1;
            position++;
        }
        return max;
    }
}
