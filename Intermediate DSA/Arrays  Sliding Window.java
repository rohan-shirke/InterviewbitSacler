// Q1. Subarray with given sum and length
public class Solution {
    public int solve(int[] A, int B, int C) {
        int s = 0;
        int e = B-1;
        while(e<A.length){
            int sum = 0;
            for(int i=s; i<=e; i++){
             sum +=A[i];
            } 
            if(sum==C){
                return 1;
            }
            s++;
            e++;
        }
        return 0;
    }
}
// Q2. Minimum Swaps
public class Solution {
    public int solve(int[] A, int B) {
        int windowLength = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]<=B){
                windowLength +=1;
            }
            
        }
        int count = 0;
        for(int i=0; i<windowLength; i++){
            if(A[i]<=B){
                count +=1;
            }
        }
        int result = windowLength-count;
        int s=1;
        int e=windowLength;
        while(e<A.length){
            if(A[s-1]<=B){
                count-=1;
            }
            if(A[e]<=B){
                count+=1;
            }
            result = Math.min(result, windowLength-count);
            s++;
            e++;
        }
        return result;
    }
}


// Q3. Spiral Order Matrix II
public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] matrix = new int[A][A];
        int i=0;
        int j=0;
        int itrValue = A-1;
        int value =1;
        
        while(itrValue>=0){
            if(itrValue == 0){
                matrix[i][j] = value;
                break;
            }
            for(int k=0; k<itrValue; k++){
                matrix[i][j] = value;
                value++;
                j++;
            }
            for(int k=0; k<itrValue; k++){
                matrix[i][j] = value;
                value++;
                i++;
            }
            for(int k=0; k<itrValue; k++){
                matrix[i][j] = value;
                value++;
                j--;
            }
            for(int k=0; k<itrValue; k++){
                matrix[i][j] = value;
                value++;
                i--;
            }
            i++;
            j++;
            itrValue -= 2;
        }
        return matrix;
    }
}

// Q1. Subarray with least average
public class Solution {
    public int solve(int[] A, int B) {
        int sum = 0;
        for(int i=0; i<B; i++){
            sum+=A[i];
        }
        int result=sum;
        int s=1;
        int e=B;
        int index =0;
        while(e<A.length){
            sum = sum-A[s-1]+A[e];
            if(sum<result){
                result=sum;
                index=s;
            }
            s++;
            e++;
        }
        return index;
    }
}
