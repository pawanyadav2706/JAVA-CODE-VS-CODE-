public class powerofthree {
    public static void main(String [] args){
        int n = 27;
        Solution sol = new Solution();
        boolean result = sol.ispowerofthree(n);
        System.out.println(result);
    }
}
class Solution {
    public boolean ispowerofthree(int n){
        if(n <= 0){
            return false;
        }
        while(n % 3 == 0){
            n = n / 3;
        }
        return n == 1;
    }
}
