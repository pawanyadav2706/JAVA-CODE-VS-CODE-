public class JumpGame {
    public static void main(String[] args){
        int [] nums = {1,2,3,4,5};
        Solution s = new Solution();
        boolean result = s.canjump(nums);
        System.out.println(result);
    }
}
class Solution {
    public boolean canjump(int[] nums){
        int maxReach = 0;
        for(int i=0; i<nums.length; i++){
            if(i > maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }
}
