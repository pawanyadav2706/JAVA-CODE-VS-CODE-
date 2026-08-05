

public class ArmStrongnumer {
    public static void main(String [] args){
        int n = 153;
        Solution s  = new Solution();
        System.out.println(s.isrmstrong(n));
    }    
}
class Solution {
    public boolean isrmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        return sum == original;
    }
}
