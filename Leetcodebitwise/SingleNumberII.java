import java.util.*;
public class SingleNumberII {
    public static void main(String [] args){
        int [] nums = {1,2,3,3,3,2,2};
        Solution sol = new Solution();
        System.out.println(sol.issinglenumber(nums));;
    }
}
class Solution {
    public int issinglenumber(int [] nums){
        int ans = 0;
        for(int i = 0; i<32; i++){
            int sum = 0;
            for(int j = 0; j< nums.length; j++){
                if(((nums[j] >> i) & 1) == 1){
                    sum++;
                }
            }
                sum = sum % 3;
                if(sum != 0){
                    ans = ans | sum << i;
                }
            }
        
        return ans;
    }
}
