class Solution {
    public int fun(int[] nums,int mid,int threshold){
        int an=0;
        for(int i=0;i<nums.length;i++){
            int di=(int)Math.ceil((double)nums[i]/mid);
            an+=di;
        }
        return an;
    }
    public int smallestDivisor(int[] nums, int threshold) {
         int low=1;
         int high=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
           // low=Math.min(low,nums[i]);
            high=Math.max(high,nums[i]);
         }
        
            int ans=high;
         while(low<=high){
            int mid=low+(high-low)/2;
         
            int div=fun(nums,mid,threshold);
            if(div<=threshold){
               ans=Math.min(ans,mid);
               high=mid-1;
            }
            else{
                low=mid+1;
            }
         }
         return ans;
    }
}