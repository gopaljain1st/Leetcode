//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking count of total testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            int n, m;

            // taking count of elements in array a
            n = sc.nextInt();

            // taking count of elements in array b
            m = sc.nextInt();

            // Creating 2 arrays of n and m
            int a[] = new int[n];
            int b[] = new int[m];

            // inserting elements to array a
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // inserting elements to array b
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling NumberofElementsInIntersection method
            // and printing the result
            System.out.println(ob.NumberofElementsInIntersection(a, b, n, m));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int count =0;
        if (n>=m){
            Set<Integer> hashSet = new HashSet<Integer>(m);
            for(int i=0;i<m;i++){
                hashSet.add(b[i]);
            }
            for (int i=0;i<n;i++){
                count += hashSet.remove(a[i]) ? 1 : 0;
            }
        } else {
                Set<Integer> hashSet = new HashSet<Integer>(n);
                for(int i=0;i<n;i++){
                    hashSet.add(a[i]);
                }
                for (int i=0;i<m;i++){
                    count += hashSet.remove(b[i]) ? 1 : 0;
                }
        }
        return count;
    }
};
