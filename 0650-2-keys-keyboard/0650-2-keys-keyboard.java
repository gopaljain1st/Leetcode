class Solution {
    public int minSteps(int n) {
         int res = 0;
        
    for (int k = n, i = 0; k > 1; k = i) {
        for (i = k >> 1; k % i != 0; i--);
        res += k / i;
    }
        
    return res;
    }
}