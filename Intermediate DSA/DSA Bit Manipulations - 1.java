// Q7. Any base to decimal
public class Solution {
    public int solve(int A, int B) {
        int dec = 0;
        int pow = 0;
        while(A>0){
            int rem = A%10;
            dec += rem*Math.pow(B, pow);
            pow +=1;
            A/=10;
        }
        return dec;
    }
}

// Q8. Decimal to Any Base
public class Solution {
    public int DecimalToAnyBase(int A, int B) {
       int result = 0;
       int pow = 0;
       while(A>0){
           int rem = A%B;
           result += rem*Math.pow(10, pow);
           A/=B;
           pow+=1;
       } 
       return result;
    }
}


// Q9. Single Number

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int result = 0;
        for(int element : A){
            result = result^element;
        }
        return result;
    }
}


// Q1. XOR Sum

public class Solution {
    public int solve(int A, int B) {
        int x =Math.min(A, B);

        int result = (x^A)+(x^B);

        return result;
    }
}

// Q2. Interesting Array

public class Solution {
    public String solve(int[] A) {
        if(A.length==1){
            if(A[0]==0){
                return "Yes";
            }else{
                return "No";
            }
        }
        int xor=0;
        for(int i=0; i<A.length; i++){
            xor ^= A[i];
        }
        if(xor%2==0){
            return "Yes";
        }else{
            return "No";
        }
    }
}



// Q3. Subarrays with Bitwise OR 1

public class Solution {
    public long solve(int A, int[] B) {
        long zeroCount = 0;
        long result = 0;

        for(int i=0; i<A; i++){
            if(B[i]==1){
                result += (A-i)*(zeroCount+1);
                zeroCount =0;
            }else{
                zeroCount++;
            }
        }
        return result;
    }
}

