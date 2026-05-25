import java.util.*;
public class Sumzero{
    public static void main(String[] args){
        int n = 5;
        Solution s = new Solution();
        int [] result = s.sumzero(n);
        System.out.println(Arrays.toString(result));
    }
}

class Solution{
    public int [] sumzero(int n){
        int [] ans = new int[n];
        int index = 0;

        for(int i = 1; i< n / 2; i++){
            ans[index++] = i;
            ans[index++] = -i;
        }

        return ans;
    }
}