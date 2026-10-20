class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int res=0;
        int sum=0;
        int left=0;
      Set<Integer> map=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(map.contains(nums[right])){
                map.remove(nums[left]);
                sum-=nums[left];
                left++;
                
            }
            sum+=nums[right];
            map.add(nums[right]);
            res=Math.max(res,sum);
           
        }
        return res;
    }
}