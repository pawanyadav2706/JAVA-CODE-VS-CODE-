import java.util.*;
public class Sumof1darray {
    public static void main(String[] args){
        int [] nums= {1,2,3,4};
        Solution s = new Solution();
        int [] result = s.runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}


class Solution{
    public int[] runningSum(int[] nums){
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i]+ nums[i-1];
        }
        return nums;
    }
}
