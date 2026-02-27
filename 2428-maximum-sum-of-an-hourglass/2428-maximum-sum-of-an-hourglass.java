class Solution {
    public int maxSum(int[][] grid) {
        int res = 0, currSum = 0;

        int m = grid.length, n = grid[0].length;
        for(int i = 0; i<=(m-3); i++){
            for(int j = 0; j<=(n-3); j++){
                currSum += (grid[i][j] + grid[i][j+1] + grid[i][j+2]);
                int mid = (j+(j+2))/2;
                currSum += grid[i+1][mid];
                int k = i+2;
                currSum += (grid[k][j] + grid[k][j+1] + grid[k][j+2]);
                res = Math.max(currSum, res);
                currSum = 0;
            }
        }

        return res;
    }
}