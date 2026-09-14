class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length-1;
        if(nums[0]<nums[n]) count++;
        for(int i=1;i<=n;i++){
            if(nums[i-1]>nums[i]) count++;
        }
        if(count<=1) return true;

        return false;
    }
}