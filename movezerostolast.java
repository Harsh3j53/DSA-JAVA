
import java.util.ArrayList;

public class movezerostolast {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = movezeroesoptimal(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");

    }
    



    static int[] movezeroesBrute(int n, int []arr){
        ArrayList<Integer>temp = new ArrayList<>();
        for (int i=0; i< n ; i++){
            if (arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int nz = temp.size();

        for (int i=0;i<nz;i++){
            arr[i] = temp.get(i);
        }

        for (int i=nz;i<n;i++){
            arr[i] = 0;
        }

        return arr;
    }

    static int [] movezeroesoptimal(int n, int []arr){
        int j = -1;
        for (int i=0 ; i<n ;i++){
            if (arr[i]==0){
                j=i;
                break;
            }
        }
        if (j== -1) return arr;
        
        for(int i=j+1; i<n; i++ ){
            if (arr[i]!=0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
                j++;
            }
        }
        return arr;
    }
}
