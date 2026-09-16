class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
                val=Math.max(val,cnt);
            }
            else{
                cnt=0;
            }
            
        }
        return val;
    }
}