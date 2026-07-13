import java.util.*;
public class SingleNumber {
    public static void main(String [] args){
        int [] nums = {4,1,1,3,3};
        Solution s = new Solution();
        System.out.println(s.singleNumber(nums));
    }
}
class Solution {
    public int singleNumber(int [] nums){
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
