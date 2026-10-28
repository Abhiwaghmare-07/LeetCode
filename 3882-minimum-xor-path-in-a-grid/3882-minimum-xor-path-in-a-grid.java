class Solution {
    public int helper(int grid[][], int i, int j, int cost, int dp[][][]) {
        if (i >= grid.length || j >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return cost ^ grid[i][j];
        }
        if (dp[i][j][cost ^ grid[i][j]] != -1) {
            return dp[i][j][cost ^ grid[i][j]];
        }
        int right = helper(grid, i + 1, j, cost ^ grid[i][j], dp);
        int down = helper(grid, i, j + 1, cost ^ grid[i][j], dp);

        return dp[i][j][cost ^ grid[i][j]] = Math.min(down, right);
    }

    public int minCost(int[][] grid) {
        int dp[][][] = new int[grid.length][grid[0].length][1024];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return helper(grid, 0, 0, 0, dp);
    }
}