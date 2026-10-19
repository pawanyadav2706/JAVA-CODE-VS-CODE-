import java.util.*;
public class FindTargetIndicesSortingArray {
    public static void main(String [] args){
        int [] arr = {1,2,5,2,3};
        int target = 2;
        Solution sol = new Solution();
        System.out.println(sol.targetIndices(arr, target));
    }
}
class Solution {
    public List<Integer> targetIndices(int[] arr, int target){
        bubble(arr);

        List<Integer> result = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                result.add(i);
            }
        }
        return result;
    }
    static void bubble(int [] arr){
        for(int i = 0; i<arr.length - 1; i++){
            for(int j = 1; j<arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    // temp 
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}
