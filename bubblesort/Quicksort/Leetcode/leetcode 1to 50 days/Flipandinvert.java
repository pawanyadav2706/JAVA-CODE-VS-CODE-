import java.util.*;
public class Flipandinvert{
    public static void main(String[] args){
        int [] [] image = {{1,1,0},{1,0,1},{0,0,0}};
        Solution s = new Solution();
        int [] [] result = s.flipandinvertimage(image);
        System.out.println(Arrays.deepToString(result));
    }
}

class Solution{
    public int[][] flipandinvertimage(int[][] image){
        for(int i=0; i<image.length; i++){
            int left = 0;
            int right = image[i].length -1;

            while(left <= right){
            int temp = image[i][left] ^ 1;
            image[i][left] = image[i][right] ^ 1;
            image[i][right] = temp;
            left++;
            right--;
            }
        }
        return image;
    }
}