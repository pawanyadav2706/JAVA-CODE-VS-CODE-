import java.util.*;
public class RangeQuerysum {
    public static void main(String [] args){
        int [] nums = {1,3,5,7,8,9};
        Solution sol = new Solution(nums);
        System.out.println(sol.rangenumber(1, 5));
    } 
}
class Solution {
    int [] nums ;
    public Solution (int [] nums){
        this.nums = nums;
    }
    public int rangenumber(int left, int right){
        int sum = 0;
        for(int i= left; i<=right; i++){
            sum = sum + nums[i];
        }
        return sum;
    }
}
