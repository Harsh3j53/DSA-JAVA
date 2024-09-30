
import java.util.HashMap;
import java.util.Map;

public class onceinarr {
    public static void main (String args[]){
        int[] arr = {3, 1, 2, 1, 2};
        int ans = getsinglelementxorr(arr);
        System.out.println("element that occurs once is " + ans );
    }

    public static int getsinglelement(int[] arr){
        int n = arr.length;

        for (int i=0 ; i<n ; i++){
            int num = arr[i];
            int cnt = 0;
            
            for(int j = 0 ; j<n ;j ++){
                if (arr[j]==num){
                    cnt++;
                }      
            }
            if (cnt==1)return num;  
            
        }
        return -1;
    }


    public static int getsinglelementhash(int[] arr){
        int maxn = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++){
            maxn = Math.max(maxn , arr[i]);
        }

        int[] hash = new int [maxn + 1];

        for (int i=0; i<n ; i++){
            hash[arr[i]]++;
        }

        for (int i =0; i< n; i++){
            if (hash[arr[i]]==1){
                return arr[i];
            }
        }
        return -1;
    }

    public static int getsinglelementhashmap(int [] arr){
        int n = arr.length;
        
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i<n ; i++){
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i],value + 1);
        }

        for (Map.Entry<Integer,Integer> it: mpp.entrySet()){
            if (it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }


    public static int getsinglelementxorr(int[] arr){
        int xorr = 0;
        int n = arr.length;
        for (int i=0; i<n ; i++){
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
}
