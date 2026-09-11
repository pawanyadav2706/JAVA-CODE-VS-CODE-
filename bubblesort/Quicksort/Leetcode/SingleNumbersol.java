public class SingleNumbersol {
    public static void main(String [] args){
        int [] nums = {2,2,2,3,3,3,1};
        Solution sol = new Solution();
        int result  = sol.issinglenumebr(nums);
        System.out.println(result);
    }
}
class Solution{
    public int issinglenumebr(int [] nums){
        int ans = 0;
        for(int i =0; i<nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
