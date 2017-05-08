/**
 * Created by nbalkiss on 4/18/17.
 */
public class FindPivotInArray {

    public static int findPivot(int[] arr){
        return findPivotHelper(arr,0,arr.length-1);
    }

    private static int findPivotHelper(int[] arr, int min, int max){
        int midpoint = (max+min)/2;
        if(min==max){
            return -1;
        }
        if(arr[midpoint+1]<arr[midpoint]){
            return arr[midpoint];
        }
        if(arr[midpoint]>max){
            return findPivotHelper(arr, midpoint+1,max);
        }
        else{
            return findPivotHelper(arr, min, midpoint-1);
        }
    }
}
