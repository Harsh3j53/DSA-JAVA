public class maxcountone {

    public static void main(String[] args) {
        int []arr = {1,1,0,0,0,1,1,1,1};

        int val = consecutiveones(arr);
        System.out.print("maxconsecutiveonescnt: " +val);
    }


    static int consecutiveones(int[] arr){
        int max = 0;
        int cnt = 0;
        
        for (int i=0; i<arr.length; i++){
            if (arr[i]==1){
                cnt++;
            }else{
                cnt=0;
            }
            max = Math.max(max, cnt);
        }return max;
    }
}
