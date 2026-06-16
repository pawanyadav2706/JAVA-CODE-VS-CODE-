import java.util.*;
public class Reshapethematrix {
    public static void main(String[] args){
        int [][] mat = {
                {1,2},
                {3,4}
        };
        int r = 2;
        int c = 4;
        Solution s = new Solution();
        int [][] result = s.marixreshape(mat, r, c);
        System.out.println(Arrays.deepToString(result));
    }
}

class Solution {
    public int[][] marixreshape(int[][] mat, int r, int c){
        int m = mat.length;
        int n = mat[0].length;
        if(m * n != r * c){
            return mat;
        }
        int[][] result  = new int[r][c];
        for(int i=0; i<m * n; i++ ){
            result[i / c][i % c] = mat[i/ n][i % n];
        }
        return result;
    }
}
