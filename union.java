import java.util.ArrayList;
import java.util.HashMap;

public class union {
    public static void main(String[] args) {
        int []arr1 ={1,2,3,4,5,6};
        int []arr2 ={2,3,4,5,6,7};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> union = findunion(arr1, arr2, n, m);
        System.out.println("union of arr1 and arr2 is");
        for(int val:union){
            System.out.print(val+" ");
        }
    }

    static ArrayList<Integer> findunion(int []arr1, int []arr2, int n, int m){
        HashMap<Integer,Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0)+1);
        }
        for(int i=0 ; i<m ; i++){
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0)+1);
        }
        for (int it:freq.keySet()){
            Union.add(it);
            
        }
        return Union;

    }
    
}
