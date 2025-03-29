package Medium;

public class Best_Time_to_Buy_and_Sell_Stock2_122 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > sell) {
                sell = prices[i];
            } else if (prices[i] < sell) {
                profit += sell - buy;
                buy = prices[i];
                sell = prices[i];
            }
        }
        profit += sell - buy;
        return profit;
    }
}

/* Sell stock immediately
public int maxProfit(int[] prices) {
    int profit = 0;

    for (int i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1]) {
            profit += prices[i] - prices[i - 1];
        }
    }

    return profit;
}*/