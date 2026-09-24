class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int val:map.keySet()){
            int freq=map.get(val);
            if(freq>n/3) li.add(val);
        }
        return li;
    }
}