import java.util.Scanner;

public class Sumofnaturalno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Solution s  = new Solution();
        System.out.println(s.sum(n));

    }
}

class Solution {
    public int sum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum +i;
        }
        return sum;
    }
}
