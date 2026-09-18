import java.util.*;
public class MaxIceBuyCoins{
    public static void main(String [] args){
        int [] costs = {1,3,2,4,1};
        Solution sol = new Solution();
        int result  = sol.maxicefind(costs, 7);
        System.out.println(result);
    }
}
class Solution {
    public int maxicefind(int [] costs, int coin){
        int max = 0;
        for(int i =0; i<costs.length; i++){
            max = Math.max(max, costs[i]);
        }
        int [] countarr = new int[max + 1];
        for(int i = 0; i<costs.length; i++){
            countarr[costs[i]]++;
        }
        int total = 0;
        for(int price = 1; price <= max; price++){
            while(countarr[price] > 0 && coin >= price){
                coin = coin - price;
                total++;
                countarr[price]--;

            }
            if(coin <price){
                break;
            }
        }
        return total;
    }
}