// Q2. Special Subsequences "AG"
public class Solution {
    public int solve(String A) {
        int sfCount = 0;
        int countAG = 0;

        for(int i=A.length()-1; i>=0; i--){
            char chars = A.charAt(i);

            if(chars == 'A'){
                countAG += sfCount;
                countAG = countAG % 1000000007;
            }else if (chars == 'G'){
                sfCount+=1;
            }
        }
        return countAG;
    }
}


// Q3. Leaders in an array
public class Solution {
    public static int[] suffixMax(int[] arr){
        int[] sfMax = new int[arr.length];
        sfMax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            sfMax[i] = Math.max(sfMax[i+1], arr[i]);
        }
        return sfMax;
    }
    public int[] solve(int[] A) {
        int count = 1;
        int[] sfMax = suffixMax(A);
        for(int i=0; i<A.length-1; i++){
            if(A[i]>sfMax[i+1]){
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        //For inserting in the array
        for(int i=0; i<A.length-1; i++){
            if(A[i]>sfMax[i+1]){
                result[j] = A[i];
                j++;
            }
        }
        result[j] = A[A.length-1];

        return result;
    }
}

// Q4. Closest MinMax
public class Solution {
    public int solve(int[] A) {
        int minValue = A[0];
        int maxValue = A[0];
        for(int i=1; i<A.length; i++){
            minValue = Integer.min(minValue, A[i]);
            maxValue = Integer.max(maxValue, A[i]);
        }
        int len = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        if(A.length == 1){
            return 1;
        }
        if(minValue == maxValue){
            return 1;
        }
        for(int i=0; i<A.length; i++){
            if(A[i]==minValue){
                minIndex = i;
            }
            if(A[i]==maxValue){
                maxIndex=i;
            }
            if(maxIndex != -1 && minIndex != -1){
                len = Math.min(len, Math.abs(maxIndex - minIndex) +1);
            } 
        }
        return len;
    }
}
// Q1. Best Time to Buy and Sell Stocks I
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        if(A.length == 0){
            return 0;
        }
        int minNow = A[0];
        int maxStockProfit = 0;
        for(int i=1; i<A.length; i++){
            if(minNow>A[i]){
                minNow=A[i];
            }
            maxStockProfit = Math.max(maxStockProfit, A[i]-minNow);
        }
        return maxStockProfit;
    }
}
// Q3. Amazing Subarrays
public class Solution {
    public int solve(String A) {
        int count = 0;
        for(int i=0; i<A.length(); i++){
            char c = A.charAt(i);
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count = count + (A.length()-i);
                count %=10003;
            }
        }
        return count;
    }
}

// Q4. Even Subarrays
public class Solution {
    public String solve(int[] A) {
        int N = A.length;
        if(N%2==1){
            return "NO";
        }else{
            for(int i=1; i<N; i+=2){
                if(A[i]%2==0 && A[0]%2==0 && A[N-1-i]%2==0 && A[N-1]%2==0){
                    return "YES";
                }
            }
        }
        
        return "NO";
    }
}
// Q7. Bulbs
public class Solution {
    public int bulbs(int[] A) {
        if(A.length<1){
            return 0;
        }
        int switchcount = 0;
        if(A[0]==0){
            switchcount = 1;
        }
        for(int i=1; i<A.length; i++){
            if(A[i]!=A[i-1]){
                switchcount++;
            }
        }
        return switchcount;
    }
}
// Q8. Pick from both sides!
public class Solution {
    public int solve(int[] A, int B) {
        int sum = 0;
        int left = 0;
        int right = 0;

        for(int i=A.length-1; i>=A.length-B; i--){
            right+=A[i];
        }

        sum=right;

        for(int i=0; i<B; i++){
            left=left+A[i];
            right = right - A[A.length-B+i];
            sum = Math.max(sum, left+right);
        }
        return sum;
    }
}


