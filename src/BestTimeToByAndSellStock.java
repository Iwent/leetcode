public class BestTimeToByAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minValue) {
                minValue = prices[i];
            }

            else if(prices[i] - minValue > maxProfit) {
                maxProfit = prices[i] - minValue;
            }
        }

        return maxProfit;

    }
}
