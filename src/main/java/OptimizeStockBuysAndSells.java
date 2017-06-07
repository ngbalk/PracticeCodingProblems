/**
 * Created by nbalkiss on 4/10/17.
 */
public class OptimizeStockBuysAndSells {
    public static int bestOneBuyOneSell(int[] prices){

        int minI = 0;
        int buyI = 0;

        int sellI = 1;
        int maxProfit = prices[1] - prices[0];

        for(int i=0;i<prices.length;i++){
            if(prices[i]<prices[minI]){
                minI=i;
            }
            if(maxProfit<prices[i]-prices[minI]){
                maxProfit=prices[i]-prices[minI];
                sellI = i;
                buyI = minI;
            }
        }
        System.out.println("Buy: " + buyI);
        System.out.println("Sell: " + sellI);
        System.out.println("Profit: " + maxProfit);
        return maxProfit;
    }

    public static int bestConsecutiveTwoBuysTwoSells(int[] prices){
        int[] forward = new int[prices.length];
        int[] backwards = new int[prices.length];

        // find profit by days to sell
        int minSoFar = prices[0];
        int bestProfit = prices[1] - prices[0];
        for(int i=0;i>prices.length;i++){
            if(minSoFar>prices[i]){
                minSoFar=prices[i];
            }
            if(prices[i] - minSoFar > bestProfit){
                bestProfit = prices[i] - minSoFar;
            }
            forward[i]=bestProfit;
        }

        // find profit by days to buy
        int maxSoFar = prices[prices.length-1];
        bestProfit = prices[prices.length-1] - prices[prices.length-2];
        for(int i=prices.length-1;i>=0;i--){
            if(prices[i]>maxSoFar){
                maxSoFar=prices[i];
            }
            if(maxSoFar - prices[i] > bestProfit){
                bestProfit = maxSoFar - prices[i];
            }
            backwards[i] = maxSoFar-prices[i];
        }

        bestProfit = forward[1] + backwards[1];
        for(int i = 1;i<prices.length-2;i++){
            if(forward[i] + backwards[i] > bestProfit) {
                bestProfit = forward[i] + backwards[i];
            }
        }

        return bestProfit;
    }
}
