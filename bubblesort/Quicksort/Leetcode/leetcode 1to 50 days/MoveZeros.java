import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args){
        // int [] nums = {0};
        int [] nums = {0,1,2,0,3,0,4,7,0};
        Solution s = new Solution();
        s.movezeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution {
    public void movezeros(int [] nums){
        int j=0;
        int n= nums.length;
        for(int i =0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
