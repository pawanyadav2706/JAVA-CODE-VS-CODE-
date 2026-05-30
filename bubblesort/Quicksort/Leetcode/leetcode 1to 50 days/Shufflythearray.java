import java.util.*;
public class Shufflythearray {
    public static void main(String[] args){
        int [] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        Solution  s = new Solution();
        int [] result = s.shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }
}

class Solution{
    public int[] shuffle(int[]nums, int n){
        int [] ans = new int[2 * n];
        int pointer = 0;
        for(int i=0; i<n; i++){
            ans[pointer] = nums[i];
            pointer++;

            ans[pointer] = nums[i + n];
            pointer++;
        }
        return ans;
    }
}
