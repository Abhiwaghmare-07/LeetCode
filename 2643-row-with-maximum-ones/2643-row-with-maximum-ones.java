class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] ans=new int[2];
        int max=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    cnt++;
                }
            }
           if(max<cnt){
            max=cnt;
            ans[0]=i;
            ans[1]=max;
           }
        }
        return ans;
    }
}