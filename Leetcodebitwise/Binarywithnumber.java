public class Binarywithnumber {
    public static void main(String [] args){
        int n = 5;
        Solution sol = new Solution();
        System.out.println(sol.hasAlternatingBits(n));;
    }
}
class Solution {
    public boolean hasAlternatingBits(int n){
        int x =  n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }
}
