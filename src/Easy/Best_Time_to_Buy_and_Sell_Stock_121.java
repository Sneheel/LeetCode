package Easy;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else if (prices[i] - buyPrice > profit) {
                profit = prices[i] - buyPrice;
            }
        }
        return profit;
    }
}
