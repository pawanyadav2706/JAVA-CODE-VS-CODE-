
import java.util.*;
public class Sortedsquares {
    public static void main(String[]args){
        int [] nums = {-4,-1,0,3,10};
        Solution1 s = new Solution1();
        int[] result = s.sortedsquares(nums);
        System.out.println(Arrays.toString(result));
    }
}

class Solution1{
    public int[] sortedsquares(int[]nums){
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]* nums[i];
        }
            Arrays.sort(nums);
        return nums;
    }
}
