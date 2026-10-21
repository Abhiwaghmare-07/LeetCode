class Solution {
    public boolean isSafe(char arr[][],int row , int col,int n){
        for(int i = row ; i >= 0 ; i--){
            if(arr[i][col] == 'Q'){
                return false;
            }
        }

        for(int i = row,j = col ; i >= 0 && j < n ; i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }

        for(int i = row,j=col;i >= 0 && j >= 0 ; i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public void helper(char arr[][],int row ,int n, List<List<String>> ans){

        if(row == n){
            List<String> l = new ArrayList<>();

            for(char a[] : arr){
                l.add(new String(a));
            }
            ans.add(l);

            return;
        }

        for(int i = 0;i<n;i++){
            if(isSafe(arr,row,i,n)){
                arr[row][i] = 'Q';
                helper(arr,row+1,n,ans);
                arr[row][i] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> l = new ArrayList<>();
        char[][] arr = new char[n][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = '.';
            }
        }

        helper(arr,0,n,ans);

        return ans;
    }
}