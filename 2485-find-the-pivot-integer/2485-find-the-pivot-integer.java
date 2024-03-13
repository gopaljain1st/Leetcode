class Solution {
    public int pivotInteger(int n) {
       int sum= n*(n+1)/2;
       int a = (int) Math.sqrt(sum);
       return a * a == sum ? a : -1;
    }
}