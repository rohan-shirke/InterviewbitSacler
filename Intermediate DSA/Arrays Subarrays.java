// Q4. Subarray in given range
public class Solution {
    public int[] solve(int[] A, int B, int C) {
        int[] result = new int[C-B+1];
        int j=0;
        for(int i=B; i<=C; i++){
            result[j]= A[i];
            j++;
        }
        return result;
    }
}

// Q5. Maximum Subarray Easy
public class Solution {
    public int maxSubarray(int A, int B, int[] C) {
        int result = 0;
        for(int i=0; i<A; i++){
           int sum = 0;
           for(int j=i; j<A; j++){
               sum+=C[j];
               if(sum>result && sum<= B){
                   result=sum;
               }
           }

        }
        return result;
    }
}

// Q6. Sum of All Subarrays
public class Solution {
    public long subarraySum(int[] A) {
        long result =0;
        for(int i=0; i<A.length; i++){
            result += (long)A[i]*(i+1)*(A.length-i);
        }
        return result;
    }
}


// Q7. Generate all subarrays
public class Solution {
    public int[][] solve(int[] A) {
        int[][] result = new int[(A.length*(A.length+1))/2][];
        int count = 0;
         for(int i=0; i<A.length; i++){
             for(int j=i; j<A.length; j++){
                 result[count] = new int[j-i+1];
                 int size = 0;
                 for(int k=i; k<=j; k++){
                     result[count][size] = A[k];
                     size++;
                 }
                 count++;
             }
         }
        return result;
    }
}
// Q1. Alternating Subarrays Easy
public class Solution {
    public int[] solve(int[] A, int B) {
        int[] result = new int[A.length];
        for(int i=0; i<A.length-2*B-1; i++){
            boolean isAlternating = true;
            for(int j=0; j<2*B; j++){
                if(A[i+j] == A[i+j+1]){
                    isAlternating = false;
                    break;
                }
            }
            if(isAlternating){
                result[i] = i+B;
            }
        }
        return result;
    }
}
// Q2. Good Subarrays Easy
public class Solution {
    public int solve(int[] A, int B) {
        int count = 0;
        for(int i=0; i<A.length; i++){
            int sum = 0;
            int len = 0;
            for(int j=i; j<A.length; j++){
                sum += A[j];
                len = j-i+1;
                if((len%2==0 && sum<B) || (len%2!=0 && sum>B)){
                    count++;
                }
            }
        }
        return count;
    }
}
// Q3. Counting Subarrays Easy
public class Solution {
    public int solve(int[] A, int B) {
        int count = 0;

        for(int i=0; i<A.length; i++){
            int sum = 0;
            for(int j=i; j<A.length; j++){
                sum += A[j];
                if(sum<B){
                    count++;
                }
            }
        }
        return count;
    }
}
