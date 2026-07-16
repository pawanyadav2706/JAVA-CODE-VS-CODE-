// import java.util.*;
// // this question is from leetcode and the link is https://leetcode.com/problems/counting-bits/description/
// // this question is solution is the same as the number of 1 bits question but here we have to find the number of 1 bits for all the numbers from 0 to n and return the array of the number of 1 bits for all the numbers from 0 to n
// public class CountingBits {
//     public static void main(String [] args){
//         int n = 5;
//         Solution s = new Solution();
//         int [] result = s.countingbits(n);
//         System.out.println(Arrays.toString(result));
//     }
// }
// class Solution{
//     public int [] countingbits(int n){
//         int [] ans = new int [n + 1];
//         ans[0] = 0;
//         for(int i = 1; i<= n; i++){
//             ans[i] = ans[i / 2] + ( i % 2);
//         }
//         return ans;
//     }
// }
import java.util.*;
// this question is from leetcode and the link is https://leetcode.com/problems/counting-bits/description/
// this question is two methods solution.
public class CountingBits {
    public static void main(String [] args){
        int n = 5;
        Solution s = new Solution();
        int [] result = s.countingbits(n);
        System.out.println(Arrays.toString(result));
    }
}
class Solution{
    public int [] countingbits(int n){
       int [] ans = new int [n + 1];
       for(int i =0; i<=n; i++){
        int num = i;
        int count = 0;
        while(num > 0){
            if((num % 2) == 1){
                count++;
            }
            num = num / 2;
        }
        ans[i] = count;
       }
       return ans;
    }
}

