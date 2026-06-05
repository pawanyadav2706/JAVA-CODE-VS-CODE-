import java.util.*;
public class Diagonalsum {
    public static void main(String [] args){
        int [] [] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        Solution s = new Solution();
        int result = s.diagonalsum(mat);
        System.out.println(result);
    }
}

class Solution{
    public int diagonalsum(int[][] mat){
        int sum = 0;
        int n = mat.length;

        for(int i = 0; i<n; i++){
            sum = sum + mat[i][i]; // primary diagonal sum
            sum = sum +mat[i][n-1-i]; // secondary diagonal sum
        }
        if(n % 2 == 1){
            sum = sum - mat[n/2][n/2]; // if n is odd then we have to remove the middle element as it is added twice
        }
        return sum;
    }
}
