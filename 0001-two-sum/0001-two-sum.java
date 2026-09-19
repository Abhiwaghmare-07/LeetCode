class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                int index=map.get(rem);
                if(index==i) continue;
                if(index<i){
                    ans[0]=index;
                    ans[1]=i;
                }else{
                    ans[0]=i;
                    ans[1]=index;

                }
                return ans;
            }
        }
        return ans;
    }
}