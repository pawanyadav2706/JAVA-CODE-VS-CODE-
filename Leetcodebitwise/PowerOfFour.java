public class PowerOfFour {
    public static void main(String [] args){
        int n = 16;
        Solution s = new Solution();
        System.out.println(s.ispoweroffour(n));
    }
}
class Solution {
    public boolean ispoweroffour(int n){
        if(n <= 0){
            return false;
        }
        return (n & (n-1)) == 0 && (n-1) % 3 == 0;
    }
}
