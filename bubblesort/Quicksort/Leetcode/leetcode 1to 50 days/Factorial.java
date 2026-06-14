public class Factorial {
    public static void main(String[] args){
        int n = 5;
        Solution s = new Solution();
        System.out.println(s.factorial(n));
    }
}

class Solution {
    public int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
}