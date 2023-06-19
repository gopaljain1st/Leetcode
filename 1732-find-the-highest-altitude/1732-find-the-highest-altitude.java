class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0, sum =0;
        if(gain!=null){
            for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            if(sum>maxAltitude){
                maxAltitude = sum;
            }
        }
        }
        return maxAltitude;
    }
}