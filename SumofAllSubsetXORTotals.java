import java.util.*;
public class SumofAllSubsetXORTotals {
    public static void  main(String [] args){
        int [] nums = {5,1,6};
        Solution sol = new Solution();
        System.out.println(sol.subsetxoroperation(nums));
    }
}
class Solution {
    public int subsetxoroperation(int [] nums){
            return helper(nums, 0, 0);
    }
    public int helper(int [] nums, int index, int xor){
        // base case
        if(index == nums.length){
            return xor;
        }
        // include the current index
        int include = helper(nums, index + 1, xor ^ nums[index]);
        // exclude the current index
        int exclude = helper(nums, index + 1, xor);
        return include + exclude;
    }
}
