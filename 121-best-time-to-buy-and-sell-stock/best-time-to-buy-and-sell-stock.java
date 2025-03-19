class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profit =0;
        int curr_profit=0;
        for( int i=0; i<prices.length; i++) {
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            curr_profit = prices[i]-min_price;
            if(curr_profit > max_profit) {
                max_profit = curr_profit;
            }
        }
        return max_profit;

    }
}

/* easy understood
int min_price = prices[0];
        int max_profit =0;
        int curr_profit=0;
        for( int i=0; i<prices.length; i++) {
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            curr_profit = prices[i]-min_price;
            if(curr_profit > max_profit) {
                max_profit = curr_profit;
            }
        }
        return max_profit;

** similar loop with one line usinf max and min
for(int i=1;i<prices.size();i++){
            maxprof = max(maxprof,prices[i]-min_price);
            min_price = min(prices[i],min_price);
        }
*/
