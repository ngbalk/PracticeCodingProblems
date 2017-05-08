import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by nbalkiss on 5/1/17.
 */
public class SuppliersAndConsumers {

    @SuppressWarnings("Since15")
    public static void main(String args[]){

        // Suppliers - return an answer
        // Consumer - takes parameters

        // assign these suppliers to lambdas, lazy evaluation
        final Supplier<Boolean> compute3 = () -> computeResult(3);
        final Supplier<Boolean> compute5 = () -> computeResult(5);

        // define this consumer to this lambda which accepts a boolean
        final Consumer<Boolean> printResult = bool -> System.out.println(bool);

        printResult.accept(compute3.get());
        printResult.accept(compute5.get());

    }

    public static boolean computeResult(int num){
        return num%3==0;
    }
}
