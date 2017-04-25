import java.util.ArrayList;
import java.util.List;

/**
 * Created by nbalkiss on 4/10/17.
 */

/**
 * This returns all non-unique ways
 */
public class WaysToMakeChange {
    private int[] coins = {25,10,5};
    private int ways;


    public int makeChange(int n){
        ways = 0;
        findWays(n);
        return ways;
    }

    private void findWays(int n){
        if(n<0){
            return;
        }
        if(n==0){
            ways++;
            return;
        }
        for(int coin : coins){
            findWays(n-coin);
        }
    }

    public int makeChangeUnique(int n){
        return 0;
    }

}
