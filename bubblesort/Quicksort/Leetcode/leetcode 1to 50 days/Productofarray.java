import java.util.*;
public class Productofarray{
    public static void main(String[] args){
        int [] nums = {1,2,3,4};
        Solution s = new Solution();
        int [] result = s.productofarrayexceptself(nums);
        System.out.println(Arrays.toString(result));
    }
}

class Solution{
    public int [] productofarrayexceptself(int [] nums){
        int n = nums.length;
        int [] ans = new int[n];

        ans[0] = 1;
        for(int i=1; i<n; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }
            int suffix = 1;
            for(int i = n -1; i>=0; i--){
                ans[i] = ans[i] * suffix;
                suffix = suffix * nums[i];
            }
            return ans;
    }
}