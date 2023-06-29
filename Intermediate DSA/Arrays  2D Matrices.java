// Q1. Column Sum
public class Solution {
    public int[] solve(int[][] A) {
        int[] arr = new int[A[0].length];
        for(int i=0; i<A[0].length; i++){
            int sum = 0;
            for(int j=0; j<A.length; j++){
                sum += A[j][i];
            }
            arr[i] = sum;
        }
        return arr;
    }
}

// Q2. Row Sum
public class Solution {
    public int[] solve(int[][] A) {
        int[] result = new int[A.length];

        for(int i=0; i<A.length; i++){
            int sum = 0;
            for(int j=0; j<A[0].length; j++){
                sum += A[i][j];
            }
            result[i] = sum;
        }
        return result;
    }
}

// Q3. Main Diagonal Sum
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int sum =0;
        for(int i=0; i<A.length; i++){
            sum += A[i][i];
        }
        return sum;
    }
}
// Q4. Minor Diagonal Sum
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int n = A.length;

        int startRow= 0;
        int statColumn= n-1;
        int sum = 0;
        while(statColumn>=0){
            sum += A[startRow][statColumn];
            startRow++;
            statColumn--;
        }
        return sum;
    }
}

// Q5. Anti Diagonals

public class Solution {
    public int[][] diagonal(int[][] A) {
        int N = A.length;
        int[][] result = new int[2*N-1][N];

        for(int i=0; i<2*N-1; i++){
            int row = 0;
            int col = i;
            if(i<N){
                row = 0;
            }else{
                row = i-N+1;
            }
            if(i<N){
                col = i;
            } else{
                col = N-1;
            }
            for(int j=0; j<N && row<N && col>=0; j++, row++, col--){
                result[i][j]=A[row][col];
            }
        }
        return result;
    }
}

// Q6. Matrix Transpose
public class Solution {
    public int[][] solve(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}

// Q7. Rotate Matrix
public class Solution {
    public void solve(int[][] A) {
       int[][] result = transpose(A);
       
        for(int i=0; i<A.length; i++){
            for(int j =0; j<A[0].length; j++){
                A[i][j] = result[i][j];
            }
        }
        
        for(int i=0; i<A.length; i++){
           reverse(A[i]);
        }
    }

    public static int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
    
     public static int[] reverse(int[] A) {
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

// Q1. Matrix Scalar Product

public class Solution {
    public int[][] solve(int[][] A, int B) {
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                A[i][j] *=B;
                
            }
        }
        return A;
    }
}


// Q2. Are Matrices Same ?
public class Solution {
    public int solve(int[][] A, int[][] B) {
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(A[i][j]!=B[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
}


// Q3. Add the matrices
public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        for(int i=0;i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                A[i][j]+=B[i][j];
            }
        }
        return A;
    }
}


// Q4. Matrix Subtraction
public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                A[i][j] -= B[i][j];
            }
        }
        return A;
    }
}

// Q5. Row to Column Zero
public class Solution {
    public int[][] solve(int[][] A) {
        int[] r = new int[A.length];
        int[] c = new int[A[0].length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(A[i][j]==0){
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(r[i]==1 || c[j]==1){
                    A[i][j]=0;
                }
            }
        }

        return A;
    }
}
