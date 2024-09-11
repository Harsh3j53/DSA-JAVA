
import java.util.Arrays;

public class SecondLargest {

    public static void main (String [] args){
        int[] arr = {1,2,4,7,7,5};
        int n = arr.length;
        getElements(arr, n);
    }

    static void getElements(int[] arr, int n){
        if (n==0 || n==1){
            System.out.print(-1);
            System.out.print("");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        
        int small = arr[0];
        int secondSmallest = -1;
        for (int i=1; i<n; i++){
            if (arr[i] != small){
                secondSmallest = arr[i];
                break;
            }
        }

        int large = arr[n-1];
        int secondLargest = -1;
        for (int i = n-2; i>=0; i--){
            if(arr[i] != large){
                secondLargest = arr[i];
                break;
            }
        }

        if (secondSmallest == -1){
            System.err.println("no second smallest element");
        }else{
            System.err.println("second smallest is"+secondSmallest);
        }

        if (secondLargest == -1){
            System.err.println("no second Largest element");
        }else{
            System.err.println("second smallest is"+secondLargest);
        }
        
    }
}