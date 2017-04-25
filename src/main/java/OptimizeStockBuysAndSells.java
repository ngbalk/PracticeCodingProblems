/**
 * Created by nbalkiss on 4/10/17.
 */
public class OptimizeStockBuysAndSells {
    public static int bestOneBuyOneSell(int[] prices){
        int minSoFar = Integer.MAX_VALUE;
        int maxSoFar = 0;
        for(int p : prices){
            if(p<minSoFar){
                minSoFar=p;
            }
            if(maxSoFar<p-minSoFar){
                maxSoFar=p-minSoFar;
            }
        }
        return maxSoFar;
    }

//    public static int bestConsecutiveTwoBuysTwoSells(int[] prices){
//        int[] bestProfitIfSoldTodayOrBefore = new int[prices.length];
//        int[] bestProfitIfBoughtTodayOrLater = new int[prices.length];
//
//        // forward
//        int minSoFar = 0;
//        int bestProfitSoFar = 0;
//        for(int i=0;i>prices.length;i++){
//            if(minSoFar>prices[i]){
//                minSoFar=prices[i];
//            }
//            if(bestProfitSoFar)
//            bestProfitIfSoldTodayOrBefore[i]=prices[i]-minSoFar;
//        }
//
//
//        return 0;
//    }
}
