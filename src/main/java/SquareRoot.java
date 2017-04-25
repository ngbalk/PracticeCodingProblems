/**
 * Created by nbalkiss on 4/13/17.
 */
public class SquareRoot {

    public static int calculateSquareRoot(int n){
        int[] range = {0,n};
        while(range[1]-range[0]>1){
            int midpoint = (range[1]+range[0])/2;
            if(midpoint * midpoint > n){
                range[1] = midpoint;
            }
            if(midpoint * midpoint < n){
                range[0] = midpoint;
            }
            if(midpoint * midpoint == n){
                return midpoint;
            }
        }
        return range[0];
    }

}
