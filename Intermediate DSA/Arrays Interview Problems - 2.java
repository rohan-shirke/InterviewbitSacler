// Q1. Sum of even indices
public class Solution {
    public int[] solve(int[] A, int[][] B) {
        int[] result = new int[B.length];
        int[] pf = prefixEven(A);

        for(int i=0; i<B.length; i++){
            if(B[i][0]==0){
                result[i]=pf[B[i][1]];
            }else{
                result[i] = pf[B[i][1]]-pf[B[i][0]-1];
            }
        }
        return result;
    }
    // Even
    public static int[] prefixEven(int[] arr){
        int[] pf = new int[arr.length];
        pf[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            if(i%2==0){
                pf[i] = pf[i-1]+arr[i];
            }else{
                pf[i] = pf[i-1];
            }
        }
        return pf;
    }
}

// Q2. Sum of odd indices

public class Solution {
    public int[] solve(int[] A, int[][] B) {
        int[] result = new int[B.length];
        int[] pf = prefixOdd(A);

        for(int i=0; i<B.length; i++){
            if(B[i][0]==0){
                result[i]=pf[B[i][1]];
            }else{
                result[i] = pf[B[i][1]]-pf[B[i][0]-1];
            }
        }
        return result;
    }
    // Odd
    public static int[] prefixOdd(int[] arr){
        int[] pf = new int[arr.length];
        pf[0]=0;
        for(int i=1; i<arr.length; i++){
            if(i%2!=0){
                pf[i] = pf[i-1]+arr[i];
            }else{
                pf[i] = pf[i-1];
            }
        }
        return pf;
    }
}

// Q3. Special Index
public class Solution {
    public int solve(int[] A) {
        int[] pEven = prefixEven(A);
        int[] pOdd = prefixOdd(A);
        int count = 0;
        for(int i=0; i<A.length; i++){
            int sumEven=0; 
            int sumOdd=0;
            if(i==0){
                sumEven = pEven[A.length-1]-pOdd[i];
                sumOdd = pEven[A.length-1]-pEven[i];
            }else{
                sumEven = pEven[i-1] + pOdd[A.length-1]-pOdd[i];
                sumOdd = pOdd[i-1]+pEven[A.length-1]-pEven[i];
            }
            if(sumEven==sumOdd){
                count++;
            }
        }
        return count;
    }
    // Even
    public static int[] prefixEven(int[] arr){
        int[] pf = new int[arr.length];
        pf[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            if(i%2==0){
                pf[i] = pf[i-1]+arr[i];
            }else{
                pf[i] = pf[i-1];
            }
        }
        return pf;
    }
    // Odd
    public static int[] prefixOdd(int[] arr){
        int[] pf = new int[arr.length];
        pf[0]=0;
        for(int i=1; i<arr.length; i++){
            if(i%2!=0){
                pf[i] = pf[i-1]+arr[i];
            }else{
                pf[i] = pf[i-1];
            }
        }
        return pf;
    }
}


// Q4. Majority Element
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int majority = A[0];
        int freq =1;
        for(int i=1; i<A.length; i++){
            if(freq==0){
                majority=A[i];
                freq=1;
            }else if(A[i]==majority){
                freq++;
            }else{
                freq-=1;
            }
        }
        return majority;
    }
}

// Q1. N/3 Repeat Number
public class Solution {
    public int repeatedNumber(int[] A) {
        int majority1 = A[0];
        int freq1 = 1;
        int majority2 = 0;
        int freq2 = 0;
        int pos=0;

        for(int i=1; i<A.length; i++){
            if(A[i]==majority1){
                freq1++;
            } else{
                majority2=A[i];
                freq2=1;
                pos=i;
                break;
            }
        }


        for(int i=pos+1; i<A.length; i++){
            if(A[i]==majority1){
                freq1++;
            }else if(A[i]==majority2){
                freq2++;
            }else if(freq1==0){
                majority1=A[i];
                freq1=1;
            }else if(freq2==0){
                majority2=A[i];
                freq2=1;
            } else{
                freq1--;
                freq2--;
            }
        }
        freq1=0;
        freq2=0;

        for(int i=0;i<A.length;i++){
            if(A[i]==majority1){
                freq1++;
            }else if (A[i]==majority2){
                freq2++;
            }
        }

        if(freq1>(A.length/3)){
            return majority1;
        }
        if(freq2>(A.length/3)){
            return majority2;
        }
        return -1;
    }
}

