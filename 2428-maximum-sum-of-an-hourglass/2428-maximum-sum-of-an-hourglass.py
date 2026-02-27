class Solution:
    def maxSum(self, grid: List[List[int]]) -> int:
        res, currSum = 0, 0

        m, n = len(grid), len(grid[0])
        for i in range((m-3)+1):
            for j in range((n-3)+1):
                currSum += (grid[i][j] + grid[i][j+1] + grid[i][j+2])
                mid = (j+(j+2))//2
                currSum += grid[i+1][mid]
                currSum += (grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2])
                res = max(res, currSum)
                currSum = 0
        
        return res