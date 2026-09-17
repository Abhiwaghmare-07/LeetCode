class Solution {
    public int find(int[][] mat,int mid,int n){
       
        int maximum=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>maximum){
                maximum=mat[i][mid];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
         int[] ans=new int[2];
     int n=mat.length;
     int m=mat[0].length;
     int low=0;
     int high=m-1;
     while(low<=high){
        int mid=low+(high-low)/2;
        int maxele=find(mat,mid,n);
        int left=mid-1 >=0?mat[maxele][mid-1]:-1;
        int right=mid+1<m?mat[maxele][mid+1]:-1;
        if(mat[maxele][mid]>left && mat[maxele][mid]>right){
              ans[0]=maxele;
              ans[1]=mid;
              return  ans;
        }else if(mat[maxele][mid]<left){
                high=mid-1;
        }else{
            low=mid+1;
        }
     }
     return ans;
    }
}