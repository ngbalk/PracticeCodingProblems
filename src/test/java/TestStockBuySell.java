import org.junit.Test;

/**
 * Created by nbalkiss on 4/10/17.
 */
public class TestStockBuySell {

    @Test
    public void testOneBuyOneSell(){
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(OptimizeStockBuysAndSells.bestOneBuyOneSell(prices));
    }

    @Test
    public void testTwoConsecutiveBuysAndSells(){

    }
}
