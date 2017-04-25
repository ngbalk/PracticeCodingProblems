import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nbalkiss on 4/10/17.
 */
public class TestBalancedBraces {

    @Test
    public void testBalancedBraces(){
        String goodString = "([{}]([()]))";

        String badString = "([{(]}))";

        String tooShortString = "([{}]([()])";

        Assert.assertTrue(BalancedBraces.isBalanced(goodString));

        Assert.assertFalse(BalancedBraces.isBalanced(badString));

        Assert.assertFalse(BalancedBraces.isBalanced(tooShortString));
    }
}
