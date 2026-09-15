class Solution {
    public int partition(int[] nums,long mid,int k){
        int parts=1;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                  sum+=nums[i];
               
                
            }else{
               parts++;
                sum=nums[i];
            }
            
        }
       
        return parts;
    }
    public int splitArray(int[] nums, int k) {
        
        long low=Integer.MIN_VALUE;
        long high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            int cnt=partition(nums,mid,k);
            if(cnt<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)low;
}}