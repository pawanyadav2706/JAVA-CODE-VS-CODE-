import java.util.*;

class Item {
    int profit;
    int weight;
    double ratio;

    Item(int p, int w) {
        profit = p;
        weight = w;
        ratio = (double) p / w;
    }
}

public class Knapsack {

    public static void main(String[] args) {

        int profit[] = {10, 5, 15, 7, 6, 18, 3};
        int weight[] = {2, 3, 5, 7, 1, 4, 1};

        int W = 15;     
        int n = profit.length;

        Item items[] = new Item[n];

        
        for (int i = 0; i < n; i++) {
            items[i] = new Item(profit[i], weight[i]);
        }

        
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalProfit = 0;

        for (int i = 0; i < n; i++) {

            if (W >= items[i].weight) {
                W = W - items[i].weight;
                totalProfit = totalProfit + items[i].profit;
            }
            else {
                totalProfit = totalProfit + items[i].ratio * W;
                break;
            }
        }

        System.out.println("Maximum Profit = " + totalProfit);
    }
}