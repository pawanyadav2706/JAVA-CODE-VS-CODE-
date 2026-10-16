import java.util.*;

public class SubarrayDisnticArray {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 1);
        Solution sol = new Solution();
        System.out.println(sol.sumCounts(nums));

    }
}

class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));

                int count = set.size();
                sum = sum + count * count;
            }
        }
        return sum;
    }
}
