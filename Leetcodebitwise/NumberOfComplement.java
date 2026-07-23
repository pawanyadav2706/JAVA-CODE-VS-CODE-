public class NumberOfComplement {
    public static void main(String [] args){
        int n = 5;
        Solution sol = new Solution();
        System.out.println(sol.findComplement(n));
    }
}
class Solution {
    public int findComplement(int num){
        int mask = 1;
        while(mask < num){
            mask = (mask << 1) | 1;
        }
        return mask ^ num;

    }
}
