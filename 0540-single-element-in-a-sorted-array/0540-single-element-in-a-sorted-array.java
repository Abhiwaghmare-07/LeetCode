class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
          int n=nums.length-1;
          if(nums[0]!=nums[1]) return nums[0];
          if(nums[n]!=nums[n-1]) return nums[n];
            int low=1;
            int high=nums.length-2;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums[mid]!=nums[mid-1] && nums[mid+1]!=nums[mid]) return nums[mid];
                if(mid%2==0 && nums[mid]==nums[mid+1]){
                    low=mid+1;
                }
                else if(mid%2==0 &&nums[mid]==nums[mid-1]){
                    high=mid-1;
                }
                else if(mid%2==1 &&nums[mid]==nums[mid+1]){
                     high=mid-1;
                }else if(mid%2==1 && nums[mid]==nums[mid-1]){
                              low=mid+1;   
                }
            }
            return low;

    }
}