import org.junit.Test;

/**
 * Created by nbalkiss on 7/7/17.
 */
public class TestJavaPuzzles {

    @Test
    public void testIntegerCaching(){

        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        i1 = 30000;
        i2 = 30000;
        System.out.println(i1 == i2);
    }

    @Test
    public void testHelloGoodbye() {
        try {
            System.out.println("Hello world");
            System.exit(0);
        } finally {
            System.out.println("Goodbye world");
        }
    }
}
