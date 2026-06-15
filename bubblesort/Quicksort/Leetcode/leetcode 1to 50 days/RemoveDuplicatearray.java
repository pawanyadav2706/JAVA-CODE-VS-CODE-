public class RemoveDuplicatearray {
    public static void main(String[] args){
        int [] nums = {1,1,2,2,2,2,2,3,};
        Solution s = new Solution();
        int result  = s.removeDuplicatesarray(nums);
        System.out.println(result);
    }
}
class Solution {
    public int removeDuplicatesarray(int [] nums){
        int  j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
