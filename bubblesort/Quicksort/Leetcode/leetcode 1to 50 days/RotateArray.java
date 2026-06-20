import java.util.*;
public class RotateArray {
    public static void main(String[] args){
        int [] nums = {1,2,3,4,5,6,7};
        int k = 4;
        Solution s = new Solution();
        int [] result = s.arrayrotate(nums, k);
        System.out.println(Arrays.toString(result));

    }
}
class Solution{
    public int[] arrayrotate(int[] nums, int k){
        int n = nums.length;
        k = k %n;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int newindex = (i + k) % n;
            ans[newindex] = nums[i];
        }
        return ans;
    }
}
