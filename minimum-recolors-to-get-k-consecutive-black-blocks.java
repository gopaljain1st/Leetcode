class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minCount=Integer.MAX_VALUE;
        if (blocks.length()==k){
            int count=0;
            for (char c : blocks.toCharArray()){
                if (c=='W')
                    count++;
            }
            return count;
        }
        for(int i=0;i<=blocks.length()-k;i++){
            int count=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='W'){
                    count++;
                }
            }
            if(count==0)
                return count;
            else if(count<minCount){
                minCount=count;
            }    
        }
        return minCount;
    }
}
