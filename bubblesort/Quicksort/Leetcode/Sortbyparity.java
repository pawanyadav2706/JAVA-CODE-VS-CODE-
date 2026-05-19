
import java.util.*;

public class Sortbyparity{
    public static void main(String[]args){
        int [] nums = {3,1,2,4};
        Solution s = new Solution();
        int[] result  = s.sortbyparaty(nums);
        System.out.println(Arrays.toString(result));
    }
}


class Solution {
    public int[] sortbyparaty(int[]nums){
        int pointer = 0;
        for(int i= 0 ; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                // swap the even number with the number at the pointer index
                int temp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = temp;
                pointer++;
            }
        }
        return nums;
    }
}