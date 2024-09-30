
import java.util.HashMap;
import java.util.Map;

public class subarray {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarrayHashmap(arr, k);
        System.err.println("the length of longest subarray is " + len );
    }

    public static int getLongestSubarray(int [] arr , long k){
        int n = arr.length;
        int len = 0;

        for (int i = 0; i < n; i++){
            for ( int j = 0; j< n; j++){
                long sum = 0;

                for(int K = i; K <= j; K++){
                    sum += arr[K];
                }
                if (sum == k){
                    len = Math.max(len , j-i+1);
                }
            }
        }return len;
    }


    public static int getLongestSubarrayHashmap(int[]arr , long k){
        int n = arr.length;
        
        Map<Long,Integer> mpp = new HashMap<>();
        long sum = 0; 
        int maxLen = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            if(mpp.containsKey(rem)){
                int len = i - mpp.get(rem);
                maxLen = Math.max(len , maxLen);
            }

            if(!mpp.containsKey(sum)){
                mpp.put(sum, i);
            }
        }return maxLen;
    }

    
}
