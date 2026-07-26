public class XORoperationarray {
    public static void main(String [] args){
        int n  = 10;
        int start = 2;
        Solution sol = new Solution();
        System.out.println(sol.xoroperation(n, start));
    }
}
class Solution {
    public int xoroperation(int n, int start){
        int ans = 0;
        for(int i = 0; i< n; i++){
            ans = ans ^ (start + 2 * i);
        }
        return ans;
    }
}
