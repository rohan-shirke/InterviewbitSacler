// Q1. Count Factors - 2

public class Solution {
    public int solve(int A) {
        int count = 0;

        for(int i=1; i*i<=A; i++){
            if(A%i == 0){
                if(i!=A/i){
                    count+=2;
                }
                else{
                    count+=1;
                }
            }
        }
        return count;
    }
}

// Q2. IsPrime
public class Solution {
    public int solve(Long A) {
        if(A==1){
            return 0;
        }
        for(long i=2; i*i<=A; i++){
            if(A%i==0){
                return 0;
            }
        }
        return 1;
    }
}


// Q3. Square root of a number

public class Solution {
    public int solve(int A) {
        for(long i=1; i<=A; i++){
            if(i*i == A){
                return (int)i;
            }
        }
        return -1;
    }
}


// H/W

// Q1. Find Perfect Numbers

public class Solution {
    public int solve(int A) {
        if(A==1){
            return 0;
        }
        int sum = 1;
        for(int i=2; i<=A/i; i++){
            if(A%i==0){
                sum = sum + A/i + i;
            }
        }

       return sum == A ? 1:0;
    }
}


// Q2. Count of primes
public class Solution {
    public int solve(int A) {
        int count = 0;
        for(int i=2; i<=A; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                }
            }
            if(isPrime==true){
                count++;
            }
        }
        return count;
    }
}

// Q3. Make it
public class Solution {
    public int solve(int A, int B) {
        A*=3;
        B+=A;
        int C = B/2;
        return C;
    }
}


