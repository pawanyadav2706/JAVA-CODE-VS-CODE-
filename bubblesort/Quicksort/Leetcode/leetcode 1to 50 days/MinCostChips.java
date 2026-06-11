public class MinCostChips {
    public static void main(String[] args){
        int [] chips = {1,1000000000};
        Solution s = new Solution();
        int result = s.mincosttomovechips(chips);
        System.out.println(result);
    }
}

class Solution {
    public int mincosttomovechips(int[] chips){
        int odd =0; 
        int even = 0;
        for(int i=0; i<chips.length; i++){
            if(chips[i] % 2 ==0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}