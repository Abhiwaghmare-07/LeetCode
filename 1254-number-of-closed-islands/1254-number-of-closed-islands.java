class Solution {
    int count = 0;
    public void dfs(int grid[][],int i,int j){
        if(i >= grid.length || i< 0 || j >= grid[0].length || j < 0 || grid[i][j] == 1){
            return;
        }
        if(grid[i][j] == 0){
            grid[i][j] = 1;
            dfs(grid,i+1,j);
            dfs(grid,i-1,j);
            dfs(grid,i,j+1);
            dfs(grid,i,j-1);
        }
    }
    public int closedIsland(int[][] grid) {

        for(int i = 0;i<grid.length;i++){
            dfs(grid,i,0);
            dfs(grid,i,grid[0].length-1);
        }

        for(int i = 0;i<grid[0].length;i++){
            dfs(grid,0,i);
            dfs(grid,grid.length-1,i);
        }
        
        for(int i = 1;i<grid.length-1;i++){
            for(int j = 1;j<grid[i].length-1;j++){
                if(grid[i][j] == 0){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }

        return count;
    }
}