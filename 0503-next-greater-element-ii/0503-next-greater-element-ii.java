class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n=nums.length;
        int[] ans=new int[n];
        if(nums.length==1){
            ans[0]=-1;
            return ans;
        }
        for(int i=0;i<n;i++){
             for(int j=i+1;j<i+n;j++){
                int val=j%n;
                if(nums[val]>nums[i]){
                    ans[i]=nums[val];
                    break;
                }
                     if(j==i+n-1) ans[i]=-1;
             }
            
        }
        
        return ans;
    }
}