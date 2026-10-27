class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans=new String[m];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append('.');
        }
        ans[0]=sb.toString();
        sb.setLength(0);
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==n-1){
                    sb.append('.');
                }else{
                    sb.append('#');
                }
            }
            ans[i]=sb.toString();
             sb.setLength(0);
        }
        return ans;
    }
}