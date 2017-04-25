import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nbalkiss on 4/10/17.
 */
public class TestContiguousSubarray {

    @Test
    public void testSubarraySum(){
        int[] testArr = {-2,-3,4,-1,-2,1,5,-3};
        Assert.assertEquals(7,LargestSubarraySum.findLargestSum(testArr));
    }

    @Test
    public void testSubarray(){
        int[] testArr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("max sum: "+LargestSubarraySum.findLargestSum(testArr));
        for(int el :LargestSubarraySum.findLargestSubarray(testArr)){
            System.out.println(el);
        }
    }
}
