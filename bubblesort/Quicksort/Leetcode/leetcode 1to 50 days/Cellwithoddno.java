public class Cellwithoddno {
    public static void main(String[] args){
        int m = 2;
        int n= 2; 
        int [] [] indices = {
                {1,1},
                {0,0}
        };
        Solution s = new Solution();
        int result  = s.oddCells(m, n, indices);
        System.out.println(result);
    }
}


class Solution {
    public int oddCells(int m, int n, int[][] indices){
        int [] [] matrix = new int [m][n];
        // operation on the matrix
        for(int [] index: indices){
            int row = index[0];
            int col = index[1];

            // row operation 
            for(int j=0; j<n; j++){
                matrix[row][j]++;
            }
            // column operation
            for(int i=0; i<m; i++){
                matrix[i][col]++;
            }
        }
        // count the odd numbers in the matrix
        int  count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] %2 ==1){
                    count++;
                }
            }
        }
        return count;
    }
}