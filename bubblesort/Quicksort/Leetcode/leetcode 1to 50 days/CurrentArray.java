import java.util.Arrays;
public class CurrentArray {
    public static void main(String[] args){
        int [] nums = {8,1,2,3,4,5,6,7};
        Solution s = new Solution();
        int [] result = s.SmallerthanCurrentArray(nums);
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public int[] SmallerthanCurrentArray(int[] nums){
        int n = nums.length;
        int [] ans = new int [n];

        for(int i=0; i<n; i++){
            int count =0;

                for(int j=0; j<n; j++){
                    if(i != j && nums[j] < nums[i]){
                        count++;
                    }
                    ans[i] = count;
                }
            }
             return ans;
        }
       
    }
