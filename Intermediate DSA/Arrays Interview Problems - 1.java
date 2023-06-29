// Q2. Length of longest consecutive ones
public class Solution {
    public int solve(String A) {
        int result = Integer.MIN_VALUE;
        int onesCount = 0;

        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='1'){
                onesCount++;
            }
        }

        int leftOnes = 0;
        int rightOnes = 0;

        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='0'){
                leftOnes = 0;
                rightOnes = 0;
                //leftOnes
                int leftIndex = i-1;
                while(leftIndex>=0){
                    if(A.charAt(leftIndex)=='1'){
                        leftOnes++;
                    }else{
                        break;
                    }
                    leftIndex--;
                }

                //rightOnes
                int rightIndex = i+1;
                while(rightIndex<A.length()){
                    if(A.charAt(rightIndex) == '1'){
                        rightOnes++;
                    }else{
                        break;
                    }
                    rightIndex++;
                }

                if((leftOnes+rightOnes)<onesCount){
                    result = Math.max(result, leftOnes+rightOnes+1);
                }else{
                    result = Math.max(result, leftOnes+rightOnes);
                }
            }
        }

        if(result==Integer.MIN_VALUE){
            return A.length();
        }
        return result;
    }
}

// Q3. Count Increasing Triplets
public class Solution {
    public int solve(int[] A) {
        int result = 0;
        //jth index[i, n-1]
        for(int j=1; j<A.length-1; j++){
            int left = 0;
            int right = 0;

            for(int i=0; i<j; i++){
                if(A[i]<A[j]){
                    left+=1;
                }
            }

            for(int k=j+1; k<A.length; k++){
                if(A[k]>A[j]){
                    right+=1;
                }
            }

            result+=(left*right);
        }

        return result;
    }
}

// Q4. Josephus Problem - 2
public class Solution {
    public int solve(int A) {
        int temp=A;
        int i=0;
        while(temp>1){
            temp=temp/2;
            i++;
        }
        int kills = A-(int)Math.pow(2, i);
        return 2*kills+1;
    }
}


// Q1. Maximum positivity
public class Solution {
    public int[] solve(int[] A) {
        int count =0;
        int maxCount = Integer.MIN_VALUE;
        int maxIndex = 0;

        for(int i=0; i<A.length; i++){
            if(A[i]>=0){
                count++;
            }else{
                count=0;
            }
            if(maxCount<count){
                maxCount = count;
                maxIndex = i;
            }
        }

        int[] arr = new int[maxCount];
        int si = maxIndex-maxCount+1;
        int j=0;
        for(int i=si; i<=maxIndex; i++){
            arr[j] = A[i];
            j++;
        }
        return arr;
    }
}

// Q2. Christmas Trees
public class Solution {
    public int solve(int[] A, int[] B) {
        int result =Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){
            int leftCost = Integer.MAX_VALUE;
            int righCost = Integer.MAX_VALUE;
            for(int j=0; j<i; j++){
                if(A[j]<A[i]){
                    leftCost = Math.min(leftCost, B[j]);
                }
            }
            for(int k=i+1; k<A.length; k++){
                if(A[k]>A[i]){
                    righCost = Math.min(righCost, B[k]);
                }
            }
            if(leftCost!=Integer.MAX_VALUE && righCost!=Integer.MAX_VALUE){
                result = Math.min(result, B[i]+leftCost+righCost);
            }
        }
        if(result==Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }
}

// Q4. Multiple left rotations of the array
public class Solution {
    public int[][] solve(int[] A, int[] B) {
        int[][] result = new int[B.length][A.length];
        int row =0;
        for(int i=0; i<B.length; i++){
            int rotationVal = B[i];
            for(int j=0; j<A.length; j++){
                result[row][j] = A[(j+rotationVal)%A.length];
            }
            row++;
        }
        return result;
    }
}
