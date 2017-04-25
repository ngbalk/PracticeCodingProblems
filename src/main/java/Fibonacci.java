/**
 * Created by nbalkiss on 4/10/17.
 */
public class Fibonacci {
    public static int fibRecursive(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        return fibRecursive(n-1)+fibRecursive(n-2);
    }

    public static int fibIterative(int n){
        if(n<0){
            return 0;
        }
        int curVal = 1;
        int lastVal = 0;
        for(int i=0;i<n;i++){
            int tempVal = curVal;
            curVal = lastVal+curVal;
            lastVal = tempVal;
        }
        return curVal;
    }
}
