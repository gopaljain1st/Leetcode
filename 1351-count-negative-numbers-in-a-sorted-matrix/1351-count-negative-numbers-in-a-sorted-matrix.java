class Solution {
    public int countNegatives(int[][] grid) {
        return (int) Arrays.stream(grid).flatMapToInt(Arrays::stream).filter(g-> g < 0).count();
    }
}