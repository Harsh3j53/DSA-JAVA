public class Rotatearray {

    public static void main(String [] args) {
        int[] arr = {1,2,4,7,7,5};
        int n = arr.length;
        rotatearr(arr,n);
    }

    static void rotatearr( int arr[], int n){
        int temp = arr[0];
        for( int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1]=temp;

        for ( int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }    
}
