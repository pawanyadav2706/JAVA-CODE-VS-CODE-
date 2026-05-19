public class Profit {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};  
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i]; 
            }
            int profit = arr[i] - minPrice;  
            if (profit > maxProfit) {
                maxProfit = profit;  
            }
        }

        System.out.println("Max profit: " + maxProfit);
    }
}