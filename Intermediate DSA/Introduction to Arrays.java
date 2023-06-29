// Q1. Count of elements

public class Solution {
    public int solve(int[] A) {
        // Find Max value
        int max = A[0];
        for(int i = 0; i<A.length; i++){
            max = Math.max(max, A[i]);
        }

        // occurrence of max value
        int count = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]==max){
                count++;
            }
        }
        return A.length-count;
    }
}


// Q2. Good Pair
public class Solution {
    public int solve(int[] A, int B) {
        for(int i=0; i<A.length; i++){
            for(int j=0; j<=i; j++){
                if(i!=j){   
                    if(A[i]+A[j]==B){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}

// Q3. Reverse in a range

public class Solution {
    public int[] solve(int[] A, int B, int C) {
        int i=B;
        int j=C;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }
}


// Q4. Reverse the Array
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {
        int i = 0;
        int j = A.length-1;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp; 
            i++;
            j--;
        }
        return A;
    }
}


// Q5. Array Rotation

public class Solution {
    public int[] solve(int[] A, int B) {
        B = B%A.length;
        reverse(A, 0, A.length-1);
        reverse(A, 0, B-1);
        reverse(A, B, A.length-1);
        return A;
    }
  
    public void reverse(int[] A, int start, int end){
        while(start<end){
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
}

// Q1. Max Min of an Array
public class Solution {
    public int solve(int[] A) {
        int min = A[0];
        int max = A[0];

        for(int i=0; i<A.length; i++){
            if(A[i]<min){
                min = A[i];
            }
            if(A[i]>max){
                max = A[i];
            }
        }

        return min+max;
    }
}

// Q2. Linear Search - Multiple Occurences
public class Solution {
    public int solve(int[] A, int B) {
        int count = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] == B){
                count++;
            }
        }
        return count;
    }
}

// Q3. Second Largest
public class Solution {
    public int solve(int[] A) {
        int largest = A[0];
        int largestSecond = -1;
        if(A.length<=1){
            return -1;
        }
        for(int i=0; i<A.length; i++){
            if(A[i]>largest){
                largestSecond = largest;
                largest = A[i];
            }else if(A[i]>largestSecond && A[i] < largest){
                largestSecond=A[i];
            }
        }
        return largestSecond;
    }
}

// Q4. Range Sum Query - II

public class Solution {
    public int[] solve(int[] A, int[][] B) {
        int[] pf = new int[A.length];
        int[] result = new int[B.length];

        pf[0]=A[0];

        for(int i=1; i<A.length; i++){
            pf[i] = pf[i-1] + A[i];
        }

        for(int i=0; i<B.length; i++){
            int L = B[i][0];
            int R = B[i][1];

            if(L==1){
                result[i] = pf[R-1];
            }else{
                result[i] = pf[R-1] - pf[L-2];
            }
        }
        return result;
    }
}


// Q5. Time to equality
public class Solution {
    public int solve(int[] A) {
        int min = A[0];

        for(int i=0; i<A.length; i++){
            if(min<A[i]){
                min=A[i];
            }
        }
        int seconds = 0;

        for(int i=0; i<A.length; i++){
            seconds+=(min-A[i]);
        }
        return seconds;
    }
}

