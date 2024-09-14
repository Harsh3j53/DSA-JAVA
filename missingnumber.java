public class missingnumber {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {1,2,4,5};

        int ans = missingnumberoptimal2(arr, N);
        System.out.print("missing no. is: " + ans);

    }

    static int missingnumberbrute( int[] arr, int N){
        for(int i=1; i<N; i++){
            int flag = 0;

            for (int j=0; j<N-1; j++){
                if(arr[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0) return i;
        }
        return -1;
    }

    static int missingnumberbetter(int []arr, int N){
        int hash[] = new int[N+1];

        for(int i=0; i<N-1 ; i++){
            hash[arr[i]]++;
        }
        for(int i=1; i<=N; i++){
            if (hash[i]==0){
                return i;
            }
        }return -1;
    }

    static int missingnumberoptimal1(int []arr, int N){
        int sum1 = (N*(N+1))/2;

        int sum2 = 0;
        for(int i=0;i<N-1;i++){
            sum2 += arr[i];
        }
        int val = sum1 - sum2;
        return val;
    }

    static int missingnumberoptimal2(int []arr, int N){
        int XOR1 = 0;
        int XOR2 = 0;

        for (int i=0; i< N-1; i++){
            XOR2 = XOR2 ^ arr[i];
            XOR1 = XOR1 ^ i+1;
        }
        XOR1 = XOR1 ^ N;
        
        return XOR1 ^ XOR2;
    }
}
