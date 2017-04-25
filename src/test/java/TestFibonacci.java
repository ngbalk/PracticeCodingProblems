import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nbalkiss on 4/10/17.
 */
public class TestFibonacci {

    // 1,1,2,3,5,8,13,21,34

    @Test
    public void testFibRecursive(){
        Assert.assertEquals(0,Fibonacci.fibRecursive(-1));
        Assert.assertEquals(1,Fibonacci.fibRecursive(0));
        Assert.assertEquals(1,Fibonacci.fibRecursive(1));
        Assert.assertEquals(2,Fibonacci.fibRecursive(2));
        Assert.assertEquals(34,Fibonacci.fibRecursive(8));
    }

    @Test
    public void testFibIterative(){
        Assert.assertEquals(0,Fibonacci.fibIterative(-1));
        Assert.assertEquals(1,Fibonacci.fibIterative(0));
        Assert.assertEquals(1,Fibonacci.fibIterative(1));
        Assert.assertEquals(2,Fibonacci.fibIterative(2));
        Assert.assertEquals(34,Fibonacci.fibIterative(8));
    }
}
