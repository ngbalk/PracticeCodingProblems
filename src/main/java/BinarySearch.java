import java.util.Arrays;

/**
 * Created by nbalkiss on 4/17/17.
 */
public class BinarySearch {

    public static boolean binarySearch(int[] arr, int target){
      return doSearch(arr, 0, arr.length-1, target);
    }

    private static boolean doSearch(int[] arr, int min, int max, int target){
        if(min>max){
            return false;
        }
        int guess = (max+min)/2;
        if(arr[guess]==target){
            return true;
        }
        if(target<arr[guess]){
            return doSearch(arr, min, guess - 1, target);
        }
        else{
            return doSearch(arr, guess + 1, max, target);
        }
    }
}
