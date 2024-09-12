public class linearsearch {
    static int findnumber(int []arr, int n , int num){
        for(int i=0; i<n; i++){
            if(arr[i]==num)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int num = 5;
        int result = findnumber(arr, n, num);
        System.out.println("Number found at index: " + result);
    }
}
