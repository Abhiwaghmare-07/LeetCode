class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int positive=0;
        int negative=0;
        int k=0;
        while(k<n){
            while(positive <n &&nums[positive] <0){
                positive++;
            }
             while(negative<n && nums[negative] >0){
                negative++;
            }
           if(k%2==0){
             ans[k++]=nums[positive];
             positive++;
           }else{
             ans[k++]=nums[negative];
             negative++;
           }
        }
        return ans;
    }
}