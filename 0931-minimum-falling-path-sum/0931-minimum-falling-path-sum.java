class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for(int r=matrix.length-2;r>=0;r--) {
            for(int c=0;c<matrix.length;c++) {
                int min = matrix[r+1][c];
                if(c>0)
                    min = Math.min(min, matrix[r+1][c-1]);
                if(c<matrix.length-1)
                    min = Math.min(min, matrix[r+1][c+1]);
                matrix[r][c] = matrix[r][c] + min;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++) {
            min = Math.min(min, matrix[0][i]);
        }
        return min;
    }
}