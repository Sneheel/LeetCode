package Easy;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        while (sell < prices.length) {
            if (prices[sell] > prices[buy])
                maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            else
                buy = sell;
            sell++;
        }
        return maxProfit;
    }
}
