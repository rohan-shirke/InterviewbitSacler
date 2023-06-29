// Q1. Check bit
public class Solution {
    public int solve(int A, int B) {
        int value = A & (1<<B);
        if(value == 0){
            return 0;
        }else {
            return 1;
        }
    }
}

// Q2. Number of 1 Bits

public class Solution {
    public int numSetBits(int A) {
        int count = 0;
        for(int i=0; i<32; i++){
            if(checkBits(A, i)){
                count++;
            }
        }
        return count;
    }

    public boolean checkBits(int A, int B) {
        int value = A & (1<<B);
        if(value == 0){
            return false;
        }else {
            return true;
        }
    }
}

// Q3. Set Bit

public class Solution {
    public int solve(int A, int B) {
        return (1<<A)|(1<<B);
    }
     
}


// Q4. Unset i-th bit
public class Solution {
    public int solve(int A, int B) {
        return (A | (1<<B))^(1<<B);
    }
}


// Q1. Toggle i-th bit

public class Solution {
    public int solve(int A, int B) {
        A= A^(1<<B);
        return A;
    }
}
// Q2. Unset x bits from right

public class Solution {
    public long solve(long A, int B) {
        for(long i=0; i<B; i++){
            if(checkBits(A, i)){
            A=A^(1<<i);
        }
        }
        return A;
    }
    public boolean checkBits(long A, long B) {
        long value = A & (1<<B);
        if(value == 0){
            return false;
        }else {
            return true;
        }
    }
}


// Q3. Help From Sam
public class Solution {
    public int solve(int A) {
        int count =0;
        while(A>0){
            if((A&1)==1){
                count++;
            }
            A=A>>1;
        }
        return count;
    }
}

// Q4. Finding Good Days

public class Solution {
    public int solve(int A) {
        int count = 0;
        while(A>0){
            if((A&1)==1){
                count++;
            }
            A=A>>1;
        }
        return count;
    }
}


// Q5. Find nth Magic Number

public class Solution {
    public int solve(int A) {
        int pow =1;
        int result = 0;
        while(A>0){
            pow=pow*5;
            if((A&1)==1){
                result+=pow;
            }
            A=A>>1;
        }
        return result;
    }
}
// Q6. Reverse Bits
public class Solution {
	public long reverse(long A) {
        long result = 0;
        for(long i=0; i<32; i++){
            long bit = (A >> i) & 1;
            result = result | (bit<<(31-i));
        }
        return result;
	}
}


