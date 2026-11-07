import java.util.*;
public class KthDistinctStringinanArray {
    public static void main(String [] args){
        String [] arr = {"d", "b", "c", "b", "c", "a"};
        int k = 1;
        Solution sol = new Solution();
        System.out.println(sol.kthDistinct(arr, k));
    }
}
class Solution {
    public String kthDistinct(String[] arr, int k){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(int i = 0; i< arr.length; i++){
            if(map.get(arr[i]) == 1){
                k--;

                if(k == 0){
                    return arr[i];
                }
            }
        }
        return "";
    }
}
