class Solution {
    public int pivotInteger(int n) {
       int sum= n*(n+1)/2;
       double a= Math.sqrt(sum);
       return(a- Math.ceil(a) == 0) ? (int)a : -1;
    }
}