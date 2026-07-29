import java.util.*;
public class SinglenumberIII {
    public static void main(String [] args){
        int [] nums = {1,2,1,3,2,5};
        Solution sol = new Solution();
        int [] result = sol.isnumberofthe(nums);
        System.out.println(Arrays.toString(result));
        
    }
}
class Solution {
    public int [] isnumberofthe(int [] nums){
        int txor  = 0;
        for(int element : nums){
            txor = txor ^ element;

        }
       int mask = (txor & (txor - 1) ^ txor);
        int [] res = new int[2];
        for(int element : nums){
            if((element & mask) == 0 ){
                res[0] = res[0] ^ element;
            }else{
                res[1] = res[1] ^ element;
            }
        }
        return res;

    }
}
