public class twosum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;

        int[] ans = findtwosum(arr, target);
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
}
