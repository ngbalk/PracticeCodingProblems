import org.junit.Test;

/**
 * Created by nbalkiss on 4/17/17.
 */
public class TestBinarySearch {

    int[] arr = {1,5,7,10,12,14,15,17,21,22,23,27,31,42,44,49,59};
    int[] arrSmall = {0,1};

    @Test
    public void testBinarySearch(){
        System.out.println(BinarySearch.binarySearch(arr, 31));
        System.out.println(BinarySearch.binarySearch(arr, 32));
        System.out.println(BinarySearch.binarySearch(arr, 59));
        System.out.println(BinarySearch.binarySearch(arr, 1));
        System.out.println(BinarySearch.binarySearch(arr, 0));
        System.out.println(BinarySearch.binarySearch(arrSmall, 1));

    }
}
