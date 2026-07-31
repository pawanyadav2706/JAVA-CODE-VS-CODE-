public class Minimumnumbercount {
    public static void main(String [] args){
        int start = 12;
        int goal = 5;
        Solution sol = new Solution();
        System.out.println(sol.isfilpsnumber(start, goal));
    }
}
class Solution {
    public int isfilpsnumber(int start , int goal){
        int xor  = start ^ goal;
        int count  = 0;
        while (xor > 0) {
        count = count + (xor & 1);
            xor >>= 1;
        }
        return  count;
    }
}
