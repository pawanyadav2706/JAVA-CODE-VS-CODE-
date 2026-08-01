import java.util.*;
public class Subset {
    public static void main(String [] args){
        // int [] nums = {1, 2, 3};
        int [] nums = {0};
        Solution sol = new Solution();
        System.out.println(sol.subsets(nums));
    }
}
class Solution {
    public List<List<Integer>> subsets(int [] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, nums, current, ans);
        return ans;
    }
    public void backtrack(int index, int[] nums,List<Integer> current, List<List<Integer>> ans){
        ans.add(new ArrayList<>(current));
        for(int i = index; i<nums.length; i++){
            current.add(nums[i]);
            backtrack(i + 1, nums, current, ans);
            current.remove(current.size() - 1);
        }
    }
}