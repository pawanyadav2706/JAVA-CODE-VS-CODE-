
public class Largestarray {
    public static void main(String [] args){
        int [] arr = {1,2,54,4,7};
        Solution s = new Solution();
        System.out.println(s.largestnumber(arr));
    }
}
class Solution {
    public int largestnumber(int [] arr){
        int max = arr[0];
        for(int i = 1; i< arr.length; i++ ){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
