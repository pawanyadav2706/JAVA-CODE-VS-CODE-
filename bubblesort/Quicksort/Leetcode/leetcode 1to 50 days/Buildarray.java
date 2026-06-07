import java.util.*;
public class BuildArray {
    public static void main(String[] args){
        int [] nums = {0,2,1,5,3,4};
        Solution s = new Solution();
        int [] result = s.buildarray(nums);
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public int[] buildarray(int[] nums){
        int [] ans = new int [nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
