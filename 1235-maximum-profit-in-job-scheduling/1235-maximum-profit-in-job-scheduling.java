class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int [][]arr = new int[startTime.length][3];
        for(int i=0;i<startTime.length;i++) {
            arr[i][0] = startTime[i];
            arr[i][1] = endTime[i];
            arr[i][2] = profit[i];
        }
        int max = 0;
        Arrays.sort(arr, Comparator.comparingInt(value -> value[1]));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<startTime.length;i++) {
            Integer entryTillStartTime = map.floorKey(arr[i][0]);
            int maxProfitStartTime = entryTillStartTime==null ? 0 : map.get(entryTillStartTime);
            max = Math.max(max, maxProfitStartTime + arr[i][2]);
            map.put(arr[i][1], max);
        }
        return max;
    }
}