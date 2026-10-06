class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int s=nums[i];
            int l=nums[i];
            for(int j=i+1;j<nums.length;j++){
                s=Math.min(s,nums[j]);
                l=Math.max(l,nums[j]);
                  sum=sum+(l-s);
            }
          
        }
        return sum;
    }
}