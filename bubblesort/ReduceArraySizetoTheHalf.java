import java.util.*;
public class ReduceArraySizetoTheHalf {
    public static void main(String [] args){
        int [] arr = {3,3,3,3,5,5,5,2,2,7};
        Solution sol = new Solution();
        System.out.println(sol.minSetSize(arr));
    }
}
class Solution {
    public int minSetSize(int[] arr){
        int half = arr.length / 2;
        // find max value
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > 0){
                max = arr[i];
            }
        }
        int [] countarr = new int[max + 1];
        for(int i = 0; i<arr.length; i++){
            countarr[arr[i]]++;
        }
        int [] freq = new int[arr.length + 1];
        for(int i = 0; i<countarr.length; i++){
            if(countarr[i] > 0){
                freq[countarr[i]]++;
            }
        }
        int total = 0;
        int ans = 0;
        for(int i = freq.length - 1; i>= 0; i--){
            while(freq[i] > 0){
                total = total + i;
                ans++;

                if(total >= half){
                    return ans;
                }
                freq[i]--;
            }
        }
        return ans;
    } 
}
