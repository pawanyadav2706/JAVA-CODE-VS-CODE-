import java.util.*;
public class ImageOverLap {
    public static void main(String [] args){
        int [][] img2 = {
            {1,1,0},
            {0,1,0},
            {0,1,0}
        };
        int [][] img1 = {
            {0,0,0},
            {0,1,1},
            {0,0,1}
        };
        Solution sol = new Solution();
        System.out.println(sol.largestOverLap(img1, img2));
    }
}
class Solution {
    public int largestOverLap(int [][] img1, int [][] img2){
        int n = img1.length;
        int ans  = 0;

        for(int dr = -n+1; dr < n; dr++){
            for(int dc = -n+1; dc <n; dc++){
                int count = 0;
                for(int i = 0; i<n; i++){
                    for(int j = 0; j< n; j++){
                        int ni = i + dr;
                        int nj = j + dc;

                        if(ni >=0 && ni<n && nj>=0 && nj<n){
                            if(img1[i][j] == 1 && img2[ni][nj] == 1){
                                count++;
                            }
                        }
                    }
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
