import java.util.*;
public class Createtargetarray {
    public static void main(String[] args){
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};

        Solution s = new Solution();
        int [] ans = s.createtargetarray(nums, index);
        System.out.println(Arrays.toString(ans));
    }
}


class Solution{
    public int [] createtargetarray(int [] nums, int [] index){
        ArrayList<Integer> target = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            target.add(index[i], nums[i]);
        }

        int [] ans = new int[target.size()];

        for(int i=0; i<target.size(); i++){
            ans[i] = target.get(i);
        }
        return ans;
    }
}