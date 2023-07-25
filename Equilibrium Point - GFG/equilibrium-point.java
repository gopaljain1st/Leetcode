//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        long arraySum[] = new long[n];
        long sum=0;
        if(n>2){
            for(int i=0;i<n;i++) {
            sum+=arr[i];
            arraySum[i] = sum;
        }
        int low =0, high = n-1;
        while(low<high) {
            int mid = (low+high)/2;
            long leftSum = arraySum[mid==0 ? 0 : mid-1];
            long rightSum = arraySum[n-1] - arraySum[mid];
            if(leftSum==rightSum) {
                return mid+1;
            }
            if(leftSum<rightSum) {
                low = mid +1;
            } else {
                high = mid -1;
            }
        }
        }
        return n==1 ? 1 : -1;
    }
}
