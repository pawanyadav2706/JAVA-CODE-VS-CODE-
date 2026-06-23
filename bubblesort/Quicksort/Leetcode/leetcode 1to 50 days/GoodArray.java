public class GoodArray {
    public static void main(String[] args){
        int [] nums = {29,6,10};
        Solution s =new Solution();
        boolean result = s.isgoodarray(nums);
        System.out.println(result);
    }
}
class Solution{
    public boolean isgoodarray(int[] nums){
        int n = nums.length;
        int Gcdvalue = nums[0];

        for(int i=1; i<n; i++){
            Gcdvalue = Gc(Gcdvalue, nums[i]);
        }
        return Gcdvalue ==1;
    }
        private int Gc(int a, int b){
            while (b != 0) {
                 int temp = b;
                b = a % b;
                a = temp;
            }
             return a;
        }
       
    }
