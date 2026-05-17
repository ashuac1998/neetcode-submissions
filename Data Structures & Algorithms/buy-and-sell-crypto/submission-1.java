class Solution {
    public int maxProfit(int[] prices) {
        int low = 0;
        int high = 0;
        int maxProfit = 0;
        while(true){
            if(low == prices.length - 1){
                break;
            }
            while(high < prices.length && prices[high] >= prices[low]){
                maxProfit = Math.max(prices[high] - prices[low], maxProfit);
                high++;
            }
            // maxProfit = Math.max(prices[high] - prices[low], maxProfit);
            low++;
        }
        return maxProfit;
    }
}
