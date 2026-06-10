import java.util.ArrayList;
import java.util.List;

public class Luckynumber {
    public static void main(String[] args){
        int [][] matrix = {
                {3,7,8,9},
                {10,11,12,13},
                {14,15,16,17}
        };
        Solution s = new Solution();
        List<Integer> result = s.LuckyNumbers(matrix);
        System.out.println(result);
    }
}
class Solution{
    public List<Integer> LuckyNumbers (int[][] matrix){
        List<Integer> ans  = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            int minval = matrix[i][0];
            int col = 0;
            for(int j=1; j<n; j++){
                if(matrix[i][j] <minval){
                    minval = matrix[i][j];
                    col =j;
                }
            }
            boolean isLucky = true;
            for(int k=0; k<m; k++){
                if(matrix[k][col] > minval){
                    isLucky = false;
                    break;
                }
            }
            if(isLucky){
                ans.add(minval);
            }
        }
        return ans;
    }
}