public class PowerofTwo {
    public static void main(String [] args){
        // int n = 16;
        int n = 1;
        Solution s = new Solution();
        System.out.println(s.ispoweroftwo(n));
    }
}
class Solution {
    public boolean ispoweroftwo(int n){
        if(n <= 0){
            return false;
        }
        return (n & (n-1)) == 0;
    }
}
