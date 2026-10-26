class Solution {
    public  long dfs(int[][] grid,int i,int j,int k){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return 0;
        long count=grid[i][j];
        grid[i][j]=0;
         count+=dfs(grid,i+1,j,k);
        count+= dfs(grid,i-1,j,k);
         count+=dfs(grid,i,j+1,k);
        count+= dfs(grid,i,j-1,k);
        return count;
    }
    public int countIslands(int[][] grid, int k) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    long count=dfs(grid,i,j,k);
                    if(count%k==0) ans++;
                }
            }
        }
        return ans;
    }
}