// Q1. Prefix Sum Formula
prefSum[i] = prefSum[i - 1] + A[i]

// Q2. Time Complexity of Prefix Sum
O(N)

// Q3. Range Sum Query
public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {
        long[] pf = new long[A.length];
        long[] result = new long[B.length];

        pf[0]=A[0];

        for(int i=1; i<A.length; i++){
            pf[i] = pf[i-1] + A[i];
        }

        for(int i=0; i<B.length; i++){
            int L = B[i][0];
            int R = B[i][1];

            if(L==1){
                result[i] =pf[R-1];
            }else{
                result[i] =pf[R-1]-pf[L-2];
            }
        }
        return result;
    }
}

// Q4. In-place Prefix Sum
public class Solution {
    public int[] solve(int[] A) {
        int[] pf = new int[A.length];
        pf[0] = A[0];

        for(int i=1; i<A.length; i++){
            pf[i] = pf[i-1]+A[i];
        }
        return pf;
    }
}

// Q5. Equilibrium index of an array
public class Solution {
    public static int[] prefixSum(int[] arr){
        int[] pf = new int[arr.length];
        pf[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            pf[i] = pf[i-1]+arr[i];
        }
        return pf;
    }
    public int solve(int[] A) { 
        int N = A.length;
        int[] pf = prefixSum(A);

        if(pf[N-1]-pf[0]==0){
            return 0;
        }

        for(int i=1; i<N; i++){
            int ls = pf[i-1];
            int rs = pf[N-1]-pf[i];
            if(ls==rs){
                return i;
            }
        }
        return -1;

    }
}

// Q6. Even numbers in a range
public class Solution {
    public static int[] perfixCount(int[] arr){
        int[] pf = new int[arr.length];
        if(arr[0]%2==0){
            pf[0]=1;
        }else{
            pf[0]=0;
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i]%2==0){
                pf[i]=pf[i-1]+1;
            }else{
                pf[i] = pf[i-1];
            }
        }
        return pf;
    }
    public int[] solve(int[] A, int[][] B) {
        int [] result = new int[B.length];
        int [] pf = perfixCount(A);

        for(int i=0; i<B.length; i++){
            int L = B[i][0];
            int R = B[i][1];
            if(L==0){
                result[i] = pf[R];
            }else{
                result[i] = pf[R]-pf[L-1];
            }
        }
        return result;
    }
}

// Q4. Product array puzzle
public class Solution {
    public int[] solve(int[] A) {
        int[] result = new int[A.length];
        int product = 1;
        for(int i=0; i<A.length; i++){
            result[i] = product;
            product *= A[i];
        }
        product =1;
        for(int i=A.length-1; i>=0; i--){
            result[i]*=product;
            product*= A[i];
        }
        return result;
    } 
}


