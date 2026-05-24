// leetcode 53. maximum subarray 
// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

public class Maxsubarray {
    public static void main(String[] args){
        int [] nums = {5,4,-1,7,8};

        Solution s = new Solution();
        int ans = s.subarray(nums);
        System.out.println(ans);
    }
}


class Solution{
    public int subarray(int [] nums){
        int currsum = 0;
        int maxsum = nums[0];

        for(int i = 0;  i<nums.length; i++){
            currsum = currsum + nums[i];
            if(currsum > maxsum){
                maxsum = currsum;
            }
            if(currsum < 0){
                currsum = 0 ;
            }
        }
        return maxsum;
    }
}
