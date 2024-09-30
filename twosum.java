
import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;

        int[] ans = findtwosumhashmap(arr, target);
        System.out.println("Array indexes " + ans[0] + " + "  + ans[1] + " results to target");
    }

    public static int[] findtwosum(int []arr, int target){
        int n = arr.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        for(int i = 0; i < n; i++){
            for(int j= i+1 ;j < n; j++ ){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static int[] findtwosumhashmap(int[] arr, int target){
        int n = arr.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

       HashMap<Integer,Integer>mpp = new HashMap<>();
        
       for(int i =0; i < n; i++){
        int num = arr[i];
        int numberneeded = target - num;

        if(mpp.containsKey(numberneeded)){
            ans[0]=mpp.get(numberneeded);
            ans[1]=i;
            return ans;
        }
        mpp.put(arr[i],i);
       }
       return ans;   
    }
}
