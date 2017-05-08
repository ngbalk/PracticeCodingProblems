import com.stacksandqueues.FindNearestSmallerElement;
import com.stacksandqueues.LargestRectangleInHistogram;
import com.stacksandqueues.SimplifyDirectoryPath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nbalkiss on 4/26/17.
 */
public class TestStackAndQueueOperations {

    @Test
    public void testSimplifyDirectoryPath(){
        Assert.assertEquals("/c", SimplifyDirectoryPath.simplifyPath("/a/./b/../../c/"));
        Assert.assertEquals("/home",SimplifyDirectoryPath.simplifyPath("/home/"));

    }

    @Test
    public void testFindNearestSmallerElement(){
        int[] A = {4, 5, 2, 10};
        int[] G = FindNearestSmallerElement.findNearestSmallest(A);
        for(Integer i : G){
            System.out.print(i+" ");
        }
    }

    @Test
    public void testMaxRectInHistogram(){
        int[] histogram = {2,1,5,6,2,3};
        Assert.assertEquals(10, LargestRectangleInHistogram.largestRectangle(histogram));
        int[] histogramB = {1,3,2,1,2};
        Assert.assertEquals(5, LargestRectangleInHistogram.largestRectangle(histogramB));

    }
}
