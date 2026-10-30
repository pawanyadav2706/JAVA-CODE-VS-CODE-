import java.util.*;
public class HappyanNumber {
    public static void main(String [] args){
        int n = 18;
        Solution sol = new Solution();
        System.out.println(sol.isHappynumber(n));
    }
}
class Solution {
    public boolean isHappynumber(int n){
        int slow = n;
        int fast = n;
        do{
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        }while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }
    private int findsquare(int number){
        int ans =  0;
        while(number > 0){
            int rem = number % 10;
            ans = ans + rem * rem ;
            number = number / 10;
        }
        return ans;
    }
}
