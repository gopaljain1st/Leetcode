class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int start = intervals[0][0], end = intervals[0][1], count=0;
        int[][] temp = new int[intervals.length][2];
        for(int i=1;i<intervals.length;i++){
           if((start<= intervals[i][0] && intervals[i][0] <= end) || (intervals[i][0]<= start && intervals[i][0]<=end)) {
                if (start>intervals[i][0]) {
                    start = intervals[i][0];
                } 
               if(end<intervals[i][1]){
                   end = intervals[i][1];
               }
            } else {
                temp[count][0] = start;
                temp[count++][1] = end;
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        temp[count][0] = start;
        temp[count][1] = end;
        int result[][] = new int[count+1][2];
        for(int i=0;i<=count;i++){
            result[i][0] = temp[i][0];
            result[i][1] = temp[i][1];
        }
        return result;
    }
}