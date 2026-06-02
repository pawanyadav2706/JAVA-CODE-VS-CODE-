import java.util.*;
public  class ConcatenationofArray {
    public static void main(String[] args){
        int [] nums= {1,2,3};
        Solution s = new Solution();
        int [] result = s.getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}

class Solution{
    public int[] getConcatenation(int[] nums){
        int n = nums.length;
        int [] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}