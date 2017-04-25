import java.util.Arrays;
import java.util.List;

/**
 * Created by nbalkiss on 4/10/17.
 */
public class LargestSubarraySum {

    public static int findLargestSum(int[] arr){
        int bsf = 0;
        int cur = 0;
        for(int el : arr){
            if(cur+el>0){
                cur = cur+el;
            }
            else{
                cur=0;
            }
            if(bsf < cur){
                bsf = cur;
            }
        }
        return bsf;
    }

    public static int[] findLargestSubarray(int[] arr){
        int bsf = 0;
        int cur = 0;
        int bsfIndex=0;
        for(int i=0;i<arr.length;i++){
            int el = arr[i];
            if(cur+el>0){
                cur = cur+el;
            }
            else{
                cur=0;
            }
            if(bsf < cur){
                bsf = cur;
                bsfIndex = i;
            }
        }


        int i = bsfIndex;
        while(bsf>0){
            bsf-=arr[i];
            i--;
        }
        //noinspection Since15
        return Arrays.copyOfRange(arr,i+1,bsfIndex+1);
    }
}
