import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by nbalkiss on 4/13/17.
 */
public class TestPrintTree {
    SimpleBalancedTree tree;

    @Before
    public void setUp(){
        tree = new SimpleBalancedTree(15);
    }

    @Test
    public void testPrintPreOrderTree(){
        tree.preOrderPrintTree();
    }

    @Test
    public void testPrintInOrderTree(){
        tree.inOrderPrintTree();
    }

    @Test
    public void testPostOrderTree(){
        tree.postOrderPrintTree();
    }

    @Test
    public void testPrintLevels(){
        tree.printLevels();
    }

    @Test
    public void testPrintLevelsZigZag(){ tree.printLevelsZigZag(); }

    @Test
    public void testVerticlePrint(){ tree.verticlePrintTree(); }
}
