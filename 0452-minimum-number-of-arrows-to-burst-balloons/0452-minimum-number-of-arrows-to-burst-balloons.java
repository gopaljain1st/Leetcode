class Solution {
    public int findMinArrowShots(int[][] data) {
        Arrays.sort(data, Comparator.comparingInt(a -> a[1]));
        int count = 0;
        long arrow=Long.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i][0] <= arrow && arrow <= data[i][1]) {
                continue;
            }
            count++;
            arrow = data[i][1];
        }
        return count;
    }
}